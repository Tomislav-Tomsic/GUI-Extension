package tomislavt.extensions.GUIExtension;

import java.util.ArrayList;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;

@DesignerComponent(version = 1,
                   description = " Various simple improvments",
                   category = ComponentCategory.EXTENSION,
                   nonVisible = true,
                   iconName = "aiwebres/bluerect16.png")
@SimpleObject(external = true)
public class GUIExtension extends AndroidNonvisibleComponent {

  private final Activity context;
  private final Form form;

  // Lists

  private final java.util.List<AndroidViewComponent> FirstList;
  private final java.util.List<AndroidViewComponent> SecondList;
  private final java.util.List<AndroidViewComponent> ThirdList;
  private final java.util.List<AndroidViewComponent> FourthList;
  private final java.util.List<Label> FirstLabelsList;
  private final java.util.List<Label> SecondLabelsList;
  private final java.util.List<Button> FirstButtonList;
  private final java.util.List<Button> SecondButtonList;
  private final java.util.List<Button> ThirdButtonList;
  private final java.util.List<Button> FourthButtonList;
  private final java.util.List<Button> FifthButtonList;
  private final java.util.List<Button> SixthButtonList;

  public GUIExtension(ComponentContainer container) {
    super(container.$form());
    context = container.$context();
    form = container.$form();

    FirstList = new ArrayList<AndroidViewComponent>();
    SecondList = new ArrayList<AndroidViewComponent>();
    ThirdList = new ArrayList<AndroidViewComponent>();
    FourthList = new ArrayList<AndroidViewComponent>();
    FirstLabelsList = new ArrayList<Label>();
    SecondLabelsList = new ArrayList<Label>();
    FirstButtonList = new ArrayList<Button>();
    SecondButtonList = new ArrayList<Button>();
    ThirdButtonList = new ArrayList<Button>();
    FourthButtonList = new ArrayList<Button>();
    FifthButtonList = new ArrayList<Button>();
    SixthButtonList = new ArrayList<Button>();
  }

  @SimpleFunction(description = "Adds margins, all of them equal, to a visible component")
  public void AddMarginsToComponent(AndroidViewComponent component, int margin) {

    android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(component.getView()
        .getLayoutParams());
    params.setMargins(margin, margin, margin, margin);
    component.getView().setLayoutParams(params);
    component.getView().invalidate();

  }

  @SimpleFunction(description = "Adds an all equal,padding, to a visible component")
  public void AddPaddingsToComponent(AndroidViewComponent component, int padding) {

    component.getView().setPadding(padding, padding, padding, padding);
    component.getView().invalidate();

  }



  @SimpleFunction(description = "Adds margins to a visible component.")
  public void SpecifyComponentMargins(
                                      AndroidViewComponent component,
                                      int left,
                                      int top,
                                      int right,
                                      int bottom) {

setMargins(component.getView(), left, top, right, bottom);

  }

  private void setMargins (View view, int left, int top, int right, int bottom) {
    if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        p.setMargins(left, top, right, bottom);
        view.requestLayout();
    }
}

  @SimpleFunction(description = "Adds an all equal,padding, to a visible component")
  public void SpecifyComponentPadding(
                                      AndroidViewComponent component,
                                      int left,
                                      int top,
                                      int right,
                                      int bottom) {

    component.getView().setPadding(left, top, right, bottom);
    component.getView().invalidate();

  }

  @SimpleFunction(description = "Adds view component to the first list.")
  public void AddComponentToFirstList(AndroidViewComponent component) {

    FirstList.add(component);

  }

  @SimpleFunction(description = "Adds view component to the second list.")
  public void AddComponentToSecondList(AndroidViewComponent component) {

    SecondList.add(component);

  }

  @SimpleFunction(description = "Adds view component to the third list.")
  public void AddComponentToThirdList(AndroidViewComponent component) {

    ThirdList.add(component);

  }

  @SimpleFunction(description = "Adds view component to the fourth list.")
  public void AddComponentToFourthList(AndroidViewComponent component) {

    FourthList.add(component);

  }

  @SimpleFunction(description = "Returns first list size.")
  public int FirstListLength() {
    int length = FirstList.size();
    return length;

  }

  @SimpleFunction(description = "Returns second list size.")
  public int SecondListLength() {
    int length = SecondList.size();
    return length;

  }

  @SimpleFunction(description = "Returns third list size.")
  public int ThirdListLength() {
    int length = ThirdList.size();
    return length;

  }

  @SimpleFunction(description = "Returns fourth list size.")
  public int FourthListLength() {
    int length = FourthList.size();
    return length;

  }

  @SimpleFunction(description = "Returns first label list size.")
  public int FirstLabelsListLength() {
    int length = FirstLabelsList.size();
    return length;

  }

  @SimpleFunction(description = "Returns second label list size.")
  public int SecondLabelsListLength() {
    int length = SecondLabelsList.size();
    return length;

  }

  @SimpleFunction(description = "Returns first button list size.")
  public int FirstButtonListLength() {
    int length = FirstButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Returns second button list size.")
  public int SecondButtonListLength() {
    int length = SecondButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Returns third button list size.")
  public int ThirdButtonListLength() {
    int length = ThirdButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Returns fourth button list size.")
  public int FourthButtonListLength() {
    int length = FourthButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Returns fifth button list size.")
  public int FifthButtonListLength() {
    int length = FifthButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Returns sixth button list size.")
  public int SixthButtonListLength() {
    int length = SixthButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Sets common properties for members of the first component list.")
  public void FirstListProperties(int width, int height, int margin, int padding) {

    for (AndroidViewComponent avc : FirstList) {
      avc.Width(width);
      avc.Height(height);
      android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(avc.getView()
          .getLayoutParams());
      params.setMargins(margin, margin, margin, margin);
      avc.getView().setPadding(padding, padding, padding, padding);
      avc.getView().setLayoutParams(params);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the second component list.")
  public void SecondListProperties(int width, int height, int margin, int padding) {

    for (AndroidViewComponent avc : SecondList) {
      avc.Width(width);
      avc.Height(height);
      android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(avc.getView()
          .getLayoutParams());
      params.setMargins(margin, margin, margin, margin);
      avc.getView().setPadding(padding, padding, padding, padding);
      avc.getView().setLayoutParams(params);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the third component list. Percent values for"
      + " width and height are from 0 to 100 and they relate to the component's parent.")
  public void ThirdListProperties(int width, int height, int margin, int padding) {

    for (AndroidViewComponent avc : ThirdList) {
      avc.Width(width);
      avc.Height(height);
      android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(avc.getView()
          .getLayoutParams());
      params.setMargins(margin, margin, margin, margin);
      avc.getView().setPadding(padding, padding, padding, padding);
      avc.getView().setLayoutParams(params);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the third component list. Percent values for"
      + " width and height are from 0 to 100 and they relate to the component's parent.")
  public void FourthListProperties(int percentWidth, int percentHeight, int margin, int padding) {

    for (AndroidViewComponent avc : FourthList) {
      avc.WidthPercent(percentWidth);
      avc.HeightPercent(percentHeight);
      android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(avc.getView()
          .getLayoutParams());
      params.setMargins(margin, margin, margin, margin);
      avc.getView().setPadding(padding, padding, padding, padding);
      avc.getView().setLayoutParams(params);
    }
  }

  @SimpleFunction(description = "Adds view component to first label list.")
  public void AddToFirstLabelList(Label label) {

    FirstLabelsList.add(label);

  }

  @SimpleFunction(description = "Adds view component to second label list.")
  public void AddToSecondLabelList(Label label) {

    SecondLabelsList.add(label);

  }

  @SimpleFunction(description = "Sets common properties for members of first labels list."
      + " 0, 1 and 2 are values for text alignement, and they stand for left, center and right, respectively.")
  public void FirstLabelsListProperties(
                                        float TextSize,
                                        int width,
                                        int height,
                                        int TextColor,
                                        int BackgroundColor,
                                        int TextAlignement,
                                        boolean bold,
                                        boolean italic) {

    for (Label lbl : FirstLabelsList) {
      lbl.FontSize(TextSize);
      lbl.Width(width);
      lbl.Height(height);
      lbl.TextColor(TextColor);
      lbl.BackgroundColor(BackgroundColor);
      lbl.TextAlignment(TextAlignement);
      lbl.TextColor(TextColor);
      lbl.FontBold(bold);
      lbl.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of second labels list."
      + " 0, 1 and 2 are values for text alignement, and they stand for left, center and right, respectively.")
  public void SecondLabelsListProperties(
                                         float TextSize,
                                         int percentWidth,
                                         int percentHeight,
                                         int TextColor,
                                         int BackgroundColor,
                                         int TextAlignement,
                                         boolean bold,
                                         boolean italic) {

    for (Label lbl : SecondLabelsList) {
      lbl.FontSize(TextSize);
      lbl.WidthPercent(percentWidth);
      lbl.HeightPercent(percentHeight);
      lbl.TextColor(TextColor);
      lbl.BackgroundColor(BackgroundColor);
      lbl.TextAlignment(TextAlignement);
      lbl.TextColor(TextColor);
      lbl.FontBold(bold);
      lbl.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Adds a button to the first button list.")
  public void AddToFirstButtonList(Button button) {

    FirstButtonList.add(button);

  }

  @SimpleFunction(description = "Adds a button to the second button list.")
  public void AddToSecondButtonList(Button button) {

    SecondButtonList.add(button);

  }

  @SimpleFunction(description = "Adds a button to the third button list.")
  public void AddToThirdButtonList(Button button) {

    ThirdButtonList.add(button);

  }

  @SimpleFunction(description = "Adds a button to the fourth button list.")
  public void AddToFourthButtonList(Button button) {

    FourthButtonList.add(button);

  }

  @SimpleFunction(description = "Adds a button to the fifth button list.")
  public void AddToFifthButtonList(Button button) {

    FifthButtonList.add(button);

  }

  @SimpleFunction(description = "Adds a button to the sixth button list.")
  public void AddToSixthButtonList(Button button) {

    SixthButtonList.add(button);

  }

  @SimpleFunction(description = "Sets common properties for members of the first button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void FirstButtonListProperties(
                                        float textSize,
                                        int shape,
                                        int width,
                                        int height,
                                        int backgroundColor,
                                        int textColor,
                                        boolean bold,
                                        boolean italic) {

    for (Button btn : FirstButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(height);
      btn.Width(width);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the second button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void SecondButtonListProperties(
                                         float textSize,
                                         int shape,
                                         int percentWidth,
                                         int percentHeight,
                                         int backgroundColor,
                                         int textColor,
                                         boolean bold,
                                         boolean italic) {

    for (Button btn : SecondButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(percentHeight);
      btn.WidthPercent(percentWidth);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the third button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void ThirdButtonListProperties(
                                        float textSize,
                                        int shape,
                                        int width,
                                        int height,
                                        int backgroundColor,
                                        int textColor,
                                        boolean bold,
                                        boolean italic) {

    for (Button btn : ThirdButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(height);
      btn.Width(width);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the fourth button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void FourthButtonListProperties(
                                         float textSize,
                                         int shape,
                                         int percentWidth,
                                         int percentHeight,
                                         int backgroundColor,
                                         int textColor,
                                         boolean bold,
                                         boolean italic) {

    for (Button btn : FourthButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(percentHeight);
      btn.WidthPercent(percentWidth);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the fifth button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void FifthButtonListProperties(
                                        float textSize,
                                        int shape,
                                        int width,
                                        int height,
                                        int backgroundColor,
                                        int textColor,
                                        boolean bold,
                                        boolean italic) {

    for (Button btn : FifthButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(height);
      btn.Width(width);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Sets common properties for members of the sixth button list."
      + " 0, 1, 2 and 3 are values for button shape, and they stand for default, rounded, rectangular and oval shapes, respectively.")
  public void SixthButtonListProperties(
                                        float textSize,
                                        int shape,
                                        int percentWidth,
                                        int percentHeight,
                                        int backgroundColor,
                                        int textColor,
                                        boolean bold,
                                        boolean italic) {

    for (Button btn : SixthButtonList) {
      btn.BackgroundColor(backgroundColor);
      btn.Height(percentHeight);
      btn.WidthPercent(percentWidth);
      btn.FontSize(textSize);
      btn.Shape(shape);
      btn.TextColor(textColor);
      btn.FontBold(bold);
      btn.FontItalic(italic);
    }
  }

  @SimpleFunction(description = "Returns a first list of components.")
  public java.util.List<AndroidViewComponent> ReturnFirstComponentsList() {

    return FirstList;

  }

  @SimpleFunction(description = "Returns a second list of components.")
  public java.util.List<AndroidViewComponent> ReturnSecondComponentsList() {

    return SecondList;

  }

  @SimpleFunction(description = "Returns a third list of components.")
  public java.util.List<AndroidViewComponent> ReturnThirdComponentsList() {

    return ThirdList;

  }

  @SimpleFunction(description = "Returns a fourth list of components.")
  public java.util.List<AndroidViewComponent> ReturnFourthComponentsList() {

    return FourthList;

  }

  @SimpleFunction(description = "Returns a first list of labels.")
  public java.util.List<Label> ReturnFirstLabelList() {

    return FirstLabelsList;

  }

  @SimpleFunction(description = "Returns a second list of labels.")
  public java.util.List<Label> ReturnSecondLabelList() {

    return SecondLabelsList;

  }

  @SimpleFunction(description = "Returns a first list of buttons.")
  public java.util.List<Button> ReturnFirstButtonList() {

    return FirstButtonList;

  }

  @SimpleFunction(description = "Returns a second list of buttons.")
  public java.util.List<Button> ReturnSecondButtonList() {

    return SecondButtonList;

  }

  @SimpleFunction(description = "Returns a third list of buttons.")
  public java.util.List<Button> ReturnThirdButtonList() {

    return ThirdButtonList;

  }

  @SimpleFunction(description = "Returns a fourth list of buttons.")
  public java.util.List<Button> ReturnFourthButtonList() {

    return FourthButtonList;

  }

  @SimpleFunction(description = "Returns a fifth list of buttons.")
  public java.util.List<Button> ReturnFifthButtonList() {

    return FifthButtonList;

  }

  @SimpleFunction(description = "Returns a sixth list of buttons.")
  public java.util.List<Button> ReturnSixthButtonList() {

    return SixthButtonList;

  }

  @SimpleFunction(description = "Returns a member of first component list with given index, starting with one.")
  public AndroidViewComponent ReturnFirstComponentsListMember(int index) {

    // Java counts from zero
    AndroidViewComponent result = FirstList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of second component list with given index, starting with one.")
  public AndroidViewComponent ReturnSecondComponentsListMember(int index) {

    // Java counts from zero
    AndroidViewComponent result = SecondList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of third component list with given index, starting with one.")
  public AndroidViewComponent ReturnThirdComponentsListMember(int index) {

    // Java counts from zero
    AndroidViewComponent result = ThirdList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of fourth component list with given index, starting with one.")
  public AndroidViewComponent ReturnFourthComponentsListMember(int index) {

    // Java counts from zero
    AndroidViewComponent result = FourthList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of first labels list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Label ReturnFirstLabelsListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Label result = FirstLabelsList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of second labels list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Label ReturnSecondLabelsListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Label result = SecondLabelsList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of first button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnFirstButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = FirstButtonList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of second button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnSecondButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = SecondButtonList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of second button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnThirdButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = ThirdButtonList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of third button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnFourthButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = FourthButtonList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of fifth button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnFifthButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = FifthButtonList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of sixth button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnSixthButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = SixthButtonList.get(index - 1);

    return result;

  }

}
