package zero.eight.donut.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Success {


    // 200 OK SUCCESS
    HOME_GIVER_SUCCESS(HttpStatus.OK, "Get request for giver's home info completed successfully "),
    HOME_RECEIVER_SUCCESS(HttpStatus.OK, "Get request for receiver's home info completed successfully "),

    //201 CREATED SUCCESS
    CREATE_GIFT_SUCCESS(HttpStatus.CREATED, "기프티콘이 성공적으로 등록되었습니다."),

    ;


    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}