package me.brucezz.viewfinder.compiler.model;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import me.brucezz.viewfinder.annotation.BindView;

/**
 * Created by brucezz on 2016-07-25.
 * Github: https://github.com/brucezz
 * Email: im.brucezz@gmail.com
 */
public class BindViewField {
    private VariableElement mFieldElement;
    private int mResId;

    public BindViewField(Element element) throws IllegalArgumentException {
        if (element.getKind() != ElementKind.FIELD) {
            throw new IllegalArgumentException(
                String.format("Only fields can be annotated with @%s", BindView.class.getSimpleName()));
        }

        mFieldElement = (VariableElement) element;
        BindView bindView = mFieldElement.getAnnotation(BindView.class);
        mResId = bindView.value();

        if (mResId < 0) {
            throw new IllegalArgumentException(
                String.format("value() in %s for field %s is not valid !", BindView.class.getSimpleName(),
                    mFieldElement.getSimpleName()));
        }
    }

    public Name getFieldName() {
        return mFieldElement.getSimpleName();
    }

    public int getResId() {
        return mResId;
    }

    public TypeMirror getFieldType() {
        return mFieldElement.asType();
    }
}
