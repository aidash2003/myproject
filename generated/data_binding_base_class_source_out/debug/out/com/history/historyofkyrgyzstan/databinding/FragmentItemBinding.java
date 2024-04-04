// Generated by view binder compiler. Do not edit!
package com.history.historyofkyrgyzstan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.history.historyofkyrgyzstan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView content;

  @NonNull
  public final TextView itemNumber;

  private FragmentItemBinding(@NonNull LinearLayout rootView, @NonNull TextView content,
      @NonNull TextView itemNumber) {
    this.rootView = rootView;
    this.content = content;
    this.itemNumber = itemNumber;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content;
      TextView content = ViewBindings.findChildViewById(rootView, id);
      if (content == null) {
        break missingId;
      }

      id = R.id.item_number;
      TextView itemNumber = ViewBindings.findChildViewById(rootView, id);
      if (itemNumber == null) {
        break missingId;
      }

      return new FragmentItemBinding((LinearLayout) rootView, content, itemNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
