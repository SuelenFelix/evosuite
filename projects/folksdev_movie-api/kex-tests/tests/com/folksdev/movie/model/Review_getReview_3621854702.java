package com.folksdev.movie.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.folksdev.movie.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Review_getReview_3621854702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28900;

    public Review_getReview_3621854702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28927 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28928 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28929 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28930 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28931 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28928, term28928.getClass(), "userId", null);
        setField(term28928, term28928.getClass(), "reviewId", null);
        setField(term28927, term28927.getClass(), "userReviewId", term28928);
        setField(term28929, term28929.getClass(), "id", null);
        setField(term28929, term28929.getClass(), "name", null);
        setField(term28929, term28929.getClass(), "userReviews", null);
        setField(term28927, term28927.getClass(), "user", term28929);
        setField(term28930, term28930.getClass(), "id", null);
        setField(term28930, term28930.getClass(), "review", null);
        setField(term28930, term28930.getClass(), "userReviews", null);
        setField(term28927, term28927.getClass(), "review", term28930);
        setField(term28931, term28931.getClass(), "date", null);
        setField(term28931, term28931.getClass(), "time", null);
        setField(term28927, term28927.getClass(), "date", term28931);
        Object term28932 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28933 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28934 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28935 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28936 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28933, term28933.getClass(), "userId", null);
        setField(term28933, term28933.getClass(), "reviewId", null);
        setField(term28932, term28932.getClass(), "userReviewId", term28933);
        setField(term28934, term28934.getClass(), "id", null);
        setField(term28934, term28934.getClass(), "name", null);
        setField(term28934, term28934.getClass(), "userReviews", null);
        setField(term28932, term28932.getClass(), "user", term28934);
        setField(term28935, term28935.getClass(), "id", null);
        setField(term28935, term28935.getClass(), "review", null);
        setField(term28935, term28935.getClass(), "userReviews", null);
        setField(term28932, term28932.getClass(), "review", term28935);
        setField(term28936, term28936.getClass(), "date", null);
        setField(term28936, term28936.getClass(), "time", null);
        setField(term28932, term28932.getClass(), "date", term28936);
        Object term28937 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28938 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28939 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28940 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28941 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28938, term28938.getClass(), "userId", null);
        setField(term28938, term28938.getClass(), "reviewId", null);
        setField(term28937, term28937.getClass(), "userReviewId", term28938);
        setField(term28939, term28939.getClass(), "id", null);
        setField(term28939, term28939.getClass(), "name", null);
        setField(term28939, term28939.getClass(), "userReviews", null);
        setField(term28937, term28937.getClass(), "user", term28939);
        setField(term28940, term28940.getClass(), "id", null);
        setField(term28940, term28940.getClass(), "review", null);
        setField(term28940, term28940.getClass(), "userReviews", null);
        setField(term28937, term28937.getClass(), "review", term28940);
        setField(term28941, term28941.getClass(), "date", null);
        setField(term28941, term28941.getClass(), "time", null);
        setField(term28937, term28937.getClass(), "date", term28941);
        Object term28942 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28943 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28944 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28945 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28946 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28943, term28943.getClass(), "userId", null);
        setField(term28943, term28943.getClass(), "reviewId", null);
        setField(term28942, term28942.getClass(), "userReviewId", term28943);
        setField(term28944, term28944.getClass(), "id", null);
        setField(term28944, term28944.getClass(), "name", null);
        setField(term28944, term28944.getClass(), "userReviews", null);
        setField(term28942, term28942.getClass(), "user", term28944);
        setField(term28945, term28945.getClass(), "id", null);
        setField(term28945, term28945.getClass(), "review", null);
        setField(term28945, term28945.getClass(), "userReviews", null);
        setField(term28942, term28942.getClass(), "review", term28945);
        setField(term28946, term28946.getClass(), "date", null);
        setField(term28946, term28946.getClass(), "time", null);
        setField(term28942, term28942.getClass(), "date", term28946);
        Object term28947 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28948 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28949 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28950 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28951 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28948, term28948.getClass(), "userId", null);
        setField(term28948, term28948.getClass(), "reviewId", null);
        setField(term28947, term28947.getClass(), "userReviewId", term28948);
        setField(term28949, term28949.getClass(), "id", null);
        setField(term28949, term28949.getClass(), "name", null);
        setField(term28949, term28949.getClass(), "userReviews", null);
        setField(term28947, term28947.getClass(), "user", term28949);
        setField(term28950, term28950.getClass(), "id", null);
        setField(term28950, term28950.getClass(), "review", null);
        setField(term28950, term28950.getClass(), "userReviews", null);
        setField(term28947, term28947.getClass(), "review", term28950);
        setField(term28951, term28951.getClass(), "date", null);
        setField(term28951, term28951.getClass(), "time", null);
        setField(term28947, term28947.getClass(), "date", term28951);
        Object term28952 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28953 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28954 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28955 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28956 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28953, term28953.getClass(), "userId", null);
        setField(term28953, term28953.getClass(), "reviewId", null);
        setField(term28952, term28952.getClass(), "userReviewId", term28953);
        setField(term28954, term28954.getClass(), "id", null);
        setField(term28954, term28954.getClass(), "name", null);
        setField(term28954, term28954.getClass(), "userReviews", null);
        setField(term28952, term28952.getClass(), "user", term28954);
        setField(term28955, term28955.getClass(), "id", null);
        setField(term28955, term28955.getClass(), "review", null);
        setField(term28955, term28955.getClass(), "userReviews", null);
        setField(term28952, term28952.getClass(), "review", term28955);
        setField(term28956, term28956.getClass(), "date", null);
        setField(term28956, term28956.getClass(), "time", null);
        setField(term28952, term28952.getClass(), "date", term28956);
        Object term28957 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28958 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28959 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28960 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28961 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28958, term28958.getClass(), "userId", null);
        setField(term28958, term28958.getClass(), "reviewId", null);
        setField(term28957, term28957.getClass(), "userReviewId", term28958);
        setField(term28959, term28959.getClass(), "id", null);
        setField(term28959, term28959.getClass(), "name", null);
        setField(term28959, term28959.getClass(), "userReviews", null);
        setField(term28957, term28957.getClass(), "user", term28959);
        setField(term28960, term28960.getClass(), "id", null);
        setField(term28960, term28960.getClass(), "review", null);
        setField(term28960, term28960.getClass(), "userReviews", null);
        setField(term28957, term28957.getClass(), "review", term28960);
        setField(term28961, term28961.getClass(), "date", null);
        setField(term28961, term28961.getClass(), "time", null);
        setField(term28957, term28957.getClass(), "date", term28961);
        ArrayList term28925 = new ArrayList();
        ((ArrayList) term28925).add(term28927);
        ((ArrayList) term28925).add(term28932);
        ((ArrayList) term28925).add(term28932);
        ((ArrayList) term28925).add(term28937);
        ((ArrayList) term28925).add(term28942);
        ((ArrayList) term28925).add(term28942);
        ((ArrayList) term28925).add(term28947);
        ((ArrayList) term28925).add(term28952);
        ((ArrayList) term28925).add(term28957);
        term28900 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28900, term28900.getClass(), "id", "CLVzSrhOjS");
        setField(term28900, term28900.getClass(), "review", "OrrgHDCMip");
        setField(term28900, term28900.getClass(), "userReviews", term28925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term28900, args);
    }

};


