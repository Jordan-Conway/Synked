package;

import openfl.display.Sprite;
import openfl.text.Font;
import openfl.text.TextField;
import openfl.text.TextFormat;

class Main extends Sprite {

	public function new() {
		super();

		trace("Hello World");

		var myText:TextBox = new TextBox();

		addChild(myText);
	}
}