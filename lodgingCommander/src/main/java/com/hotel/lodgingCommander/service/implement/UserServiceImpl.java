package com.hotel.lodgingCommander.service.implement;


import com.hotel.lodgingCommander.entity.User;
import com.hotel.lodgingCommander.model.domain.UserModel;
import com.hotel.lodgingCommander.model.repository.UserRepository;
import com.hotel.lodgingCommander.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public Boolean join(UserModel userModel) {
        // UserModel을 User 엔티티로 변환
        User user = User.builder()
                .email(userModel.getEmail())
                .tel(userModel.getTel())
                .grade(userModel.getGrade())
                .role(userModel.getRole())
                .build();

        // 데이터베이스에 사용자 저장
        repository.save(user);

        return true;
    }

    @Override
    public Boolean logIn(UserModel userModel) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(UserModel userModel) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(UserModel userModel) {
        return null;
    }
}
