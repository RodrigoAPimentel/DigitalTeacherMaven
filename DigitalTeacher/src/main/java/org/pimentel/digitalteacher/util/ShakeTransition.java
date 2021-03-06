package org.pimentel.digitalteacher.util;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

public class ShakeTransition extends CachedTimelineTransition {
	
	public ShakeTransition(final Node node) {
		super(
				node,
				new Timeline(
						new KeyFrame(Duration.millis(0), new KeyValue(node.translateXProperty(), 0, WEB_EASE)),
						new KeyFrame(Duration.millis(100), new KeyValue(node.translateXProperty(), -10, WEB_EASE)),
						new KeyFrame(Duration.millis(200), new KeyValue(node.translateXProperty(), 10, WEB_EASE)),
						new KeyFrame(Duration.millis(300), new KeyValue(node.translateXProperty(), -10, WEB_EASE)),
						new KeyFrame(Duration.millis(400), new KeyValue(node.translateXProperty(), 10, WEB_EASE)),
						new KeyFrame(Duration.millis(500), new KeyValue(node.translateXProperty(), -10, WEB_EASE)),
						new KeyFrame(Duration.millis(600), new KeyValue(node.translateXProperty(), 10, WEB_EASE)),
						new KeyFrame(Duration.millis(700), new KeyValue(node.translateXProperty(), -10, WEB_EASE)),
						new KeyFrame(Duration.millis(800), new KeyValue(node.translateXProperty(), 10, WEB_EASE)),
						new KeyFrame(Duration.millis(900), new KeyValue(node.translateXProperty(), -10, WEB_EASE)),
						new KeyFrame(Duration.millis(1000), new KeyValue(node.translateXProperty(), 0, WEB_EASE))
						)
				);
		setCycleDuration(Duration.seconds(1));
		setDelay(Duration.seconds(0.2));
	}
}