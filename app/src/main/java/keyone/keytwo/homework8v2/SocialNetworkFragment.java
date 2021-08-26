package keyone.keytwo.homework8v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static keyone.keytwo.homework8v2.R.array.test_title;

public class SocialNetworkFragment extends Fragment implements MyOnClickListener {

    public static SocialNetworkFragment newInstance() {
        return new SocialNetworkFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social_network, container, false);
        String[] data = getResources().getStringArray(test_title);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        SocialNetworkAdapter socialNetworkAdapter = new SocialNetworkAdapter(data);
        socialNetworkAdapter.setMyOnClickListener(this);
        recyclerView.setAdapter(socialNetworkAdapter);
        return view;
    }

    @Override
    public void onMyClick(View view, int position) {
        Toast.makeText(getContext(), "Тяжелая обработка для " + position, Toast.LENGTH_SHORT).show();
    }
}
