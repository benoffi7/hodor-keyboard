package com.coffeeandcookies.hodorcode;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class HodorCodeIME extends InputMethodService implements
		OnKeyboardActionListener
{

	private StringBuilder text = new StringBuilder(0);

	private HodorCodeKeyboard hodorCodeKeyboard = null;
	private HodorCodeKeyboardView hodorCodeKeyboardView = null;

	@Override
	public void onCreate()
	{
		super.onCreate();

	}

	@Override
	public void onInitializeInterface()
	{
		hodorCodeKeyboard = new HodorCodeKeyboard(this, R.layout.hodor);
	}

	@Override
	public View onCreateInputView()
	{
		hodorCodeKeyboardView = (HodorCodeKeyboardView) getLayoutInflater().inflate(R.layout.input, null);
		hodorCodeKeyboardView.setOnKeyboardActionListener(this);
		hodorCodeKeyboardView.setKeyboard(hodorCodeKeyboard);
		return hodorCodeKeyboardView;
	}

	@Override
	public void onStartInput(EditorInfo attribute, boolean restarting)
	{
		text.setLength(0);
	}

	@Override
	public void onKey(int primaryCode, int[] keyCodes)
	{
		switch (primaryCode)
		{
			case 1:
				commitText("HODOR ");
				break;

			default:
				break;
		}
	}

	@Override
	public void onRelease(int primaryCode)
	{

	}

	@Override
	public void onPress(int primaryCode)
	{

	}

	@Override
	public void onText(CharSequence text)
	{

	}

	@Override
	public void swipeLeft()
	{
		handleBackspace();
	}

	@Override
	public void swipeRight()
	{
		InputConnection ic = getCurrentInputConnection();
		ic.deleteSurroundingText(6, 0);
	}

	@Override
	public void swipeDown()
	{

	}

	@Override
	public void swipeUp()
	{

	}

	private void commitText(String s)
	{
		InputConnection ic = getCurrentInputConnection();
		ic.commitText(s, 1);
		text.setLength(0);
	}

	private void handleBackspace()
	{
		if (text.length() == 0)
		{
			getCurrentInputConnection().sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
		}
		text.setLength(0);

	}

}
