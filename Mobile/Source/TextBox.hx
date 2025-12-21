import openfl.display.Sprite;
import openfl.text.*;

class TextBox extends Sprite
{
    private var myTextBox:TextField = new TextField();
    private var myText:String = "Hello World";

    public function new() 
    {
        super();
        
        addChild(myTextBox);
        myTextBox.text = myText;
    }
}