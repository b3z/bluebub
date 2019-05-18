package bluebub;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author zeppel
 * @web https://zeppel.eu
 * @github github.com/zeppelsoftware
 *
 * @version 1
 *
 *         Library for creating nice chatbubbles in JavaFX Copyright zeppel 2019
 *
 *         Requirements: JavaFX
 *
 */
public class Bubble extends Group {

    private int p = 14;
    private int s = 2;
    private int pm = 10;
    private int sm = 2;
    private Font textFont = Font.font("Arial", 18);
    private Paint textColor = Color.WHITE;
    private Font metaFont = Font.font("Arial", 12);
    private Paint metaColor = Color.LIGHTGRAY;

    private Rectangle r;

    private Paint bubbleColor = Color.rgb(0, 126, 229);

    private int edgeRadius = 30;

    /**
     * create a chat bubble
     *
     * @param text
     */
    public Bubble(String text) {
        super();
        init(0, 0, text, "");
    }

    /**
     * create a quadratic chat bubble
     *
     * @param text
     */
    public Bubble(String text, String meta, boolean quadratic) {
        super();
        if(quadratic == true) {
            init(0, 0, text, meta);
            r.setHeight(r.getWidth());
        }
        else
            init(0, 0, text, meta);
    }

    /**
     * create a quadratic chat bubble
     * 
     * @param text
     */
    public Bubble(String text, boolean quadratic) {
        super();
        if(quadratic == true) {
            init(0, 0, text, "");
            r.setHeight(r.getWidth());
        }
        else
            init(0, 0, text, "");
    }

    /**
     * create a chat bubble
     *
     * @param text
     * @param meta
     */
    public Bubble(String text, String meta) {
        super();
        init(0, 0, text, meta);
    }

    /**
     * create a chat bubble
     *
     * @param x
     * @param y
     * @param text
     * @param meta
     */
    public Bubble(int x, int y, String text, String meta) {
        super();
        init(x, y, text, meta);
    }

    private void init(int x, int y, String text, String meta) {
        // temp for text
        Text temp = new Text(text);
        temp.setFont(textFont);
        int textW = (int) temp.getLayoutBounds().getWidth();
        int textH = (int) temp.getLayoutBounds().getHeight();
        int w = textW + p * 2 + s * 2;
        int h = textH + p * 2;
        temp = null;

        // tmp for meta
        Text tmp = new Text(meta);
        tmp.setFont(metaFont);
        int metaW = (int) tmp.getLayoutBounds().getWidth();
        int metaH = (int) tmp.getLayoutBounds().getHeight();
        h += metaH;
        temp = null;

        // label text
        Label l = new Label(text);
        l.setFont(textFont);
        l.setTextFill(textColor);
        l.setTranslateX(x + p + s);
        l.setTranslateY(y + p);

        // label meta
        Label m = new Label(meta);
        m.setFont(metaFont);
        m.setTextFill(metaColor);
        m.setTranslateX(x + (w - (metaW + pm + sm)));
        m.setTranslateY(y + textH + pm * 2);

        // bubble
        r = new Rectangle();
        r.setTranslateX(x);
        r.setTranslateY(y);

        r.setWidth(w);
        r.setHeight(h);

        r.setArcHeight(this.edgeRadius);
        r.setArcWidth(this.edgeRadius);

        r.setFill(bubbleColor);

        getChildren().addAll(r, l, m);
    }


    /**
     * set bubble width
     * @param width
     */
    public void setWidth(double width) {
        r.setWidth(width);
    }

    /**
     * set bubble height
     * @param height
     */
    public void setHeight(double height) {
        r.setWidth(height);
    }

    /**
     * Set bubble quadratic size
     * @param size
     */
    public void setQuadraticSize(double size) {
        r.setWidth(size);
        r.setHeight(size);
    }

    /**
     * set the radius of the bubble edges
     * @param radius
     */
    public void setEdgeRadius(int radius) {
        this.edgeRadius = radius;
    }

    /**
     * get the radius of the bubble edges
     *
     * @return
     */
    public int getEdgeRadius() {
        return this.edgeRadius;
    }

    /**
     * get the padding of the text
     *
     * @return
     */
    public int getTextPadding() {
        return p;
    }

    /**
     * set the padding of the text
     *
     * @param textPadding
     */
    public void setTextPadding(int textPadding) {
        this.p = textPadding;
    }

    /**
     * get the sidespace of the text
     *
     * @return
     */
    public int getTextSidespace() {
        return s;
    }

    /**
     * set the sidespace of the text
     *
     * @param textSidespace
     */
    public void setTextSidespace(int textSidespace) {
        this.s = textSidespace;
    }

    /**
     * get the padding of the meta text
     *
     * @return
     */
    public int getMetaPadding() {
        return pm;
    }

    /**
     * set the padding of the meta text
     *
     * @param metaPadding
     */
    public void setMetaPadding(int metaPadding) {
        this.pm = metaPadding;
    }

    /**
     * get the sidespace of the meta text
     *
     * @return
     */
    public int getMetaSidespace() {
        return sm;
    }

    /**
     * set the sidespace of the meta text
     *
     * @param metaSidespace
     */
    public void setMetaSidespace(int metaSidespace) {
        this.sm = metaSidespace;
    }

    /**
     * get the font of the text
     *
     * @return
     */
    public Font getTextFont() {
        return textFont;
    }

    /**
     * set the font of the text
     *
     * @param textFont
     */
    public void setTextFont(Font textFont) {
        this.textFont = textFont;
    }

    /**
     * get the color of the text
     *
     * @return
     */
    public Paint getTextColor() {
        return textColor;
    }

    /**
     * set the color of the text
     *
     * @param textColor
     */
    public void setTextColor(Paint textColor) {
        this.textColor = textColor;
    }

    /**
     * get the font of the meta text
     *
     * @return
     */
    public Font getMetaFont() {
        return metaFont;
    }

    /**
     * set the font of the meta text
     *
     * @param metaFont
     */
    public void setMetaFont(Font metaFont) {
        this.metaFont = metaFont;
    }

    /**
     * get the color of the meta text
     *
     * @return
     */
    public Paint getMetaColor() {
        return metaColor;
    }

    /**
     * set the color of the meta text
     *
     * @param metaColor
     */
    public void setMetaColor(Paint metaColor) {
        this.metaColor = metaColor;
    }

    /**
     * get the color of the bubble
     *
     * @return
     */
    public Paint getBubbleColor() {
        return bubbleColor;
    }

    /**
     * Set the color of the bubble
     *
     * @param bubbleColor
     */
    public void setBubbleColor(Paint bubbleColor) {
        this.bubbleColor = bubbleColor;
    }

}
