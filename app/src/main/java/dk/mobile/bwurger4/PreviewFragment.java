package dk.mobile.bwurger4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PreviewFragment extends Fragment {

    private TextView previewTitle;
    private ImageView previewImage;
    private TextView previewIngredients;
    private Button btnBack;


    public PreviewFragment() {
    }

    public static PreviewFragment newInstance() {
        return new PreviewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_preview, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        previewTitle = view.findViewById(R.id.preview_title);
        previewImage = view.findViewById(R.id.preview_image);
        previewIngredients = view.findViewById(R.id.preview_ingredients);
        btnBack = view.findViewById(R.id.btn_back);

        previewTitle.setText("Deluxe Burger");
        previewImage.setImageResource(R.drawable.burger);
        previewIngredients.setText("Ingredients:\n- Bun\n- Beef Patty\n- Cheese\n- Lettuce\n- Tomato\n- Onions\n- Pickles\n- Ketchup\n- Mustard");


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() != null) {
                    getActivity().getSupportFragmentManager().popBackStack();
                }
            }
        });
    }
}
