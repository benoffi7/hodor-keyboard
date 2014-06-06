package com.coffeeandcookies.hodorcode;

import java.lang.CharSequence;
import android.content.Context;
import android.inputmethodservice.Keyboard;

public class HodorCodeKeyboard extends Keyboard
{

	public HodorCodeKeyboard(Context context, int xmlLayoutResId)
	{
		super(context, xmlLayoutResId);
	}

	public HodorCodeKeyboard(Context context, int layoutTemplateResId, CharSequence characters, int columns, int horizontalPadding)
	{
		super(context, layoutTemplateResId, characters, columns, horizontalPadding);
	}

}
