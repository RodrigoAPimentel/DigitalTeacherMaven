package org.pimentel.digitalteacher.util;

import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.CacheHint;
import javafx.scene.Node;
import javafx.util.Duration;

public class CachedTimelineTransition extends Transition {

    protected static final Interpolator WEB_EASE = Interpolator.EASE_IN;
    protected Node node;
    protected Timeline timeline;
    private boolean oldCache = false;
    private CacheHint oldCacheHint = CacheHint.DEFAULT;
    private final boolean useCache;

    public CachedTimelineTransition(final Node node, final Timeline timeline) {
        this(node, timeline, true);
    }
   
    public CachedTimelineTransition(final Node node, final Timeline timeline, final boolean useCache) {
        this.node = node;
        this.timeline = timeline;
        this.useCache = useCache;
        statusProperty().addListener(new ChangeListener<Status>() {
            @Override
            public void changed(ObservableValue<? extends Status> ov, Status t, Status newStatus) {
                switch (newStatus) {
                    case RUNNING:
                        starting();
                        break;
                    default:
                        stopping();
                        break;
                }
            }
        });
    }
    
    protected void starting() {
        if (useCache) {
            oldCache = node.isCache();
            oldCacheHint = node.getCacheHint();
            node.setCache(true);
            node.setCacheHint(CacheHint.SPEED);
        }
    }
   
    protected void stopping() {
        if (useCache) {
            node.setCache(oldCache);
            node.setCacheHint(oldCacheHint);
        }
    }

    @Override
    protected void interpolate(double d) {
        timeline.playFrom(Duration.seconds(d));
        timeline.stop();
    }

    public CachedTimelineTransition setDelayTime(Duration value) {
        setDelay(value);
        return this;
    }

    public CachedTimelineTransition setOnFinish(EventHandler<ActionEvent> value) {
        setOnFinished(value);
        return this;
    }

    public CachedTimelineTransition setDuration(Duration value) {
        setCycleDuration(value);
        return this;
    }
    
    public CachedTimelineTransition setNode(Node node) {
        this.node = node;
        return this;
    }

    void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }
}
