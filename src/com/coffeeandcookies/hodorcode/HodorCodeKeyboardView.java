package com.coffeeandcookies.hodorcode;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public class HodorCodeKeyboardView extends KeyboardView
{

	public HodorCodeKeyboardView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		setPreviewEnabled(false);

	}

	public HodorCodeKeyboardView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		setPreviewEnabled(false);

	}

	public void setShifted(int state)
	{

	}

	@Override
	public void setKeyboard(Keyboard keyboard)
	{
		super.setKeyboard(keyboard);

	}

	@Override
	protected boolean onLongPress(Key key)
	{
		return super.onLongPress(key);
	}

}
