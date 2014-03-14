package org.freyja.libgdx.cocostudio.ui.parser.widget;

import org.freyja.libgdx.cocostudio.ui.CocoStudioUIEditor;
import org.freyja.libgdx.cocostudio.ui.model.CCOption;
import org.freyja.libgdx.cocostudio.ui.model.CCWidget;
import org.freyja.libgdx.cocostudio.ui.parser.WidgetParser;
import org.freyja.libgdx.cocostudio.ui.util.FontUtil;
import org.freyja.libgdx.cocostudio.ui.widget.TTFLabel;
import org.freyja.libgdx.cocostudio.ui.widget.TTFLabelStyle;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.Align;

public class CCLabel extends WidgetParser {

	@Override
	public String getClassName() {
		return "Label";
	}

	@Override
	public Actor parse(CocoStudioUIEditor editor, CCWidget widget,
			CCOption option) {

		final TTFLabelStyle labelStyle = editor.createLabelStyle(option);

		TTFLabel label = new TTFLabel(option.getText(), labelStyle);
		// label.setAlignment(option.getvAlignment(), option.gethAlignment());

		switch (option.gethAlignment()) {
		case 0:
			label.setAlignment(Align.left);
			break;
		case 1:
			label.setAlignment(Align.center);
			break;
		default:
			label.setAlignment(Align.right);
			break;
		}

		return label;
	}
}
