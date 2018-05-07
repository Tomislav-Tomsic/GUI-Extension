package tomislavt.extensions.SimplerGUIExtension;

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
public class SimplerGUIExtension extends AndroidNonvisibleComponent {

  private final Activity context;
  private final Form form;

  // Lists

  private final java.util.List<AndroidViewComponent> ComponentsList;
  private final java.util.List<Label> LabelsList;
  private final java.util.List<Button> ButtonList;

  public SimplerGUIExtension(ComponentContainer container) {
    super(container.$form());
    context = container.$context();
    form = container.$form();

    ComponentsList = new ArrayList<AndroidViewComponent>();
    LabelsList = new ArrayList<Label>();
    ButtonList = new ArrayList<Button>();
  }

  @SimpleFunction(description = "Adds margins, all of them equal, to a visible component.")
  public void AddMarginsToComponent(AndroidViewComponent component, int margin) {

    android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(component.getView()
        .getLayoutParams());
    params.setMargins(margin, margin, margin, margin);
    component.getView().setLayoutParams(params);
    component.getView().invalidate();

  }

  @SimpleFunction(description = "Adds padding, all of them equal, to a visible component")
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

  private void setMargins(View view, int left, int top, int right, int bottom) {
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
  public void AddComponentToList(AndroidViewComponent component) {

    ComponentsList.add(component);

  }

  @SimpleFunction(description = "Returns first list size.")
  public int ComponentsListLength() {
    int length = ComponentsList.size();
    return length;

  }

  @SimpleFunction(description = "Returns first label list size.")
  public int LabelsListLength() {
    int length = LabelsList.size();
    return length;

  }

  @SimpleFunction(description = "Returns first button list size.")
  public int ButtonListLength() {
    int length = ButtonList.size();
    return length;

  }

  @SimpleFunction(description = "Sets common properties for members of the first component list.")
  public void ComponentsListProperties(int width, int height, int margin, int padding) {

    for (AndroidViewComponent avc : ComponentsList) {
      avc.Width(width);
      avc.Height(height);
      android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(avc.getView()
          .getLayoutParams());
      params.setMargins(margin, margin, margin, margin);
      avc.getView().setPadding(padding, padding, padding, padding);
      avc.getView().setLayoutParams(params);
    }
  }

  @SimpleFunction(description = "Adds view component to first label list.")
  public void AddToLabelList(Label label) {

    LabelsList.add(label);

  }

  @SimpleFunction(description = "Sets common properties for members of first labels list."
      + " 0, 1 and 2 are values for text alignement, and they stand for left, center and right, respectively.")
  public void LabelsListProperties(
                                   float TextSize,
                                   int width,
                                   int height,
                                   int TextColor,
                                   int BackgroundColor,
                                   int TextAlignement,
                                   boolean bold,
                                   boolean italic) {

    for (Label lbl : LabelsList) {
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

  @SimpleFunction(description = "Adds a button to the first button list.")
  public void AddToButtonList(Button button) {

    ButtonList.add(button);

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

    for (Button btn : ButtonList) {
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

  @SimpleFunction(description = "Returns a list of components.")
  public java.util.List<AndroidViewComponent> ReturnComponentsList() {

    return ComponentsList;

  }

  @SimpleFunction(description = "Returns a list of labels.")
  public java.util.List<Label> ReturnLabelList() {

    return LabelsList;

  }

  @SimpleFunction(description = "Returns a list of buttons.")
  public java.util.List<Button> ReturnButtonList() {

    return ButtonList;

  }

  @SimpleFunction(description = "Returns a member of a component list with given index, starting with one.")
  public AndroidViewComponent ReturnComponentsListMember(int index) {

    // Java counts from zero
    AndroidViewComponent result = ComponentsList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of labels list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Label ReturnLabelsListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Label result = LabelsList.get(index - 1);

    return result;

  }

  @SimpleFunction(description = "Returns a member of first button list with given index, starting with one.")
  public com.google.appinventor.components.runtime.Button ReturnButtonListMember(int index) {

    // Java counts from zero
    com.google.appinventor.components.runtime.Button result = ButtonList.get(index - 1);

    return result;

  }
}