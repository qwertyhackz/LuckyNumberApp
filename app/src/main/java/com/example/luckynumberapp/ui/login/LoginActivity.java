package com.example.luckynumberapp.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.luckynumberapp.R;
import com.example.luckynumberapp.ui.login.LoginViewModel;
import com.example.luckynumberapp.ui.login.LoginViewModelFactory;
import com.example.luckynumberapp.databinding.ActivityLoginBinding;

