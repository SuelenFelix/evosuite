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
     Object term28902;

    public Review_getReview_3621854702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28929 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28930 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28931 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28932 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28933 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28930, term28930.getClass(), "userId", null);
        setField(term28930, term28930.getClass(), "reviewId", null);
        setField(term28929, term28929.getClass(), "userReviewId", term28930);
        setField(term28931, term28931.getClass(), "id", null);
        setField(term28931, term28931.getClass(), "name", null);
        setField(term28931, term28931.getClass(), "userReviews", null);
        setField(term28929, term28929.getClass(), "user", term28931);
        setField(term28932, term28932.getClass(), "id", null);
        setField(term28932, term28932.getClass(), "review", null);
        setField(term28932, term28932.getClass(), "userReviews", null);
        setField(term28929, term28929.getClass(), "review", term28932);
        setField(term28933, term28933.getClass(), "date", null);
        setField(term28933, term28933.getClass(), "time", null);
        setField(term28929, term28929.getClass(), "date", term28933);
        Object term28934 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28935 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28936 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28937 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28938 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28935, term28935.getClass(), "userId", null);
        setField(term28935, term28935.getClass(), "reviewId", null);
        setField(term28934, term28934.getClass(), "userReviewId", term28935);
        setField(term28936, term28936.getClass(), "id", null);
        setField(term28936, term28936.getClass(), "name", null);
        setField(term28936, term28936.getClass(), "userReviews", null);
        setField(term28934, term28934.getClass(), "user", term28936);
        setField(term28937, term28937.getClass(), "id", null);
        setField(term28937, term28937.getClass(), "review", null);
        setField(term28937, term28937.getClass(), "userReviews", null);
        setField(term28934, term28934.getClass(), "review", term28937);
        setField(term28938, term28938.getClass(), "date", null);
        setField(term28938, term28938.getClass(), "time", null);
        setField(term28934, term28934.getClass(), "date", term28938);
        Object term28939 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28940 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28941 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28942 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28943 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28940, term28940.getClass(), "userId", null);
        setField(term28940, term28940.getClass(), "reviewId", null);
        setField(term28939, term28939.getClass(), "userReviewId", term28940);
        setField(term28941, term28941.getClass(), "id", null);
        setField(term28941, term28941.getClass(), "name", null);
        setField(term28941, term28941.getClass(), "userReviews", null);
        setField(term28939, term28939.getClass(), "user", term28941);
        setField(term28942, term28942.getClass(), "id", null);
        setField(term28942, term28942.getClass(), "review", null);
        setField(term28942, term28942.getClass(), "userReviews", null);
        setField(term28939, term28939.getClass(), "review", term28942);
        setField(term28943, term28943.getClass(), "date", null);
        setField(term28943, term28943.getClass(), "time", null);
        setField(term28939, term28939.getClass(), "date", term28943);
        Object term28944 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28945 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28946 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28947 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28948 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28945, term28945.getClass(), "userId", null);
        setField(term28945, term28945.getClass(), "reviewId", null);
        setField(term28944, term28944.getClass(), "userReviewId", term28945);
        setField(term28946, term28946.getClass(), "id", null);
        setField(term28946, term28946.getClass(), "name", null);
        setField(term28946, term28946.getClass(), "userReviews", null);
        setField(term28944, term28944.getClass(), "user", term28946);
        setField(term28947, term28947.getClass(), "id", null);
        setField(term28947, term28947.getClass(), "review", null);
        setField(term28947, term28947.getClass(), "userReviews", null);
        setField(term28944, term28944.getClass(), "review", term28947);
        setField(term28948, term28948.getClass(), "date", null);
        setField(term28948, term28948.getClass(), "time", null);
        setField(term28944, term28944.getClass(), "date", term28948);
        Object term28949 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28950 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28951 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28952 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28953 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28950, term28950.getClass(), "userId", null);
        setField(term28950, term28950.getClass(), "reviewId", null);
        setField(term28949, term28949.getClass(), "userReviewId", term28950);
        setField(term28951, term28951.getClass(), "id", null);
        setField(term28951, term28951.getClass(), "name", null);
        setField(term28951, term28951.getClass(), "userReviews", null);
        setField(term28949, term28949.getClass(), "user", term28951);
        setField(term28952, term28952.getClass(), "id", null);
        setField(term28952, term28952.getClass(), "review", null);
        setField(term28952, term28952.getClass(), "userReviews", null);
        setField(term28949, term28949.getClass(), "review", term28952);
        setField(term28953, term28953.getClass(), "date", null);
        setField(term28953, term28953.getClass(), "time", null);
        setField(term28949, term28949.getClass(), "date", term28953);
        Object term28954 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28955 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28956 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28957 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28958 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28955, term28955.getClass(), "userId", null);
        setField(term28955, term28955.getClass(), "reviewId", null);
        setField(term28954, term28954.getClass(), "userReviewId", term28955);
        setField(term28956, term28956.getClass(), "id", null);
        setField(term28956, term28956.getClass(), "name", null);
        setField(term28956, term28956.getClass(), "userReviews", null);
        setField(term28954, term28954.getClass(), "user", term28956);
        setField(term28957, term28957.getClass(), "id", null);
        setField(term28957, term28957.getClass(), "review", null);
        setField(term28957, term28957.getClass(), "userReviews", null);
        setField(term28954, term28954.getClass(), "review", term28957);
        setField(term28958, term28958.getClass(), "date", null);
        setField(term28958, term28958.getClass(), "time", null);
        setField(term28954, term28954.getClass(), "date", term28958);
        Object term28959 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28960 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28961 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28962 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28963 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28960, term28960.getClass(), "userId", null);
        setField(term28960, term28960.getClass(), "reviewId", null);
        setField(term28959, term28959.getClass(), "userReviewId", term28960);
        setField(term28961, term28961.getClass(), "id", null);
        setField(term28961, term28961.getClass(), "name", null);
        setField(term28961, term28961.getClass(), "userReviews", null);
        setField(term28959, term28959.getClass(), "user", term28961);
        setField(term28962, term28962.getClass(), "id", null);
        setField(term28962, term28962.getClass(), "review", null);
        setField(term28962, term28962.getClass(), "userReviews", null);
        setField(term28959, term28959.getClass(), "review", term28962);
        setField(term28963, term28963.getClass(), "date", null);
        setField(term28963, term28963.getClass(), "time", null);
        setField(term28959, term28959.getClass(), "date", term28963);
        ArrayList term28927 = new ArrayList();
        ((ArrayList) term28927).add(term28929);
        ((ArrayList) term28927).add(term28934);
        ((ArrayList) term28927).add(term28934);
        ((ArrayList) term28927).add(term28939);
        ((ArrayList) term28927).add(term28944);
        ((ArrayList) term28927).add(term28944);
        ((ArrayList) term28927).add(term28949);
        ((ArrayList) term28927).add(term28954);
        ((ArrayList) term28927).add(term28959);
        term28902 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28902, term28902.getClass(), "id", "CLVzSrhOjS");
        setField(term28902, term28902.getClass(), "review", "OrrgHDCMip");
        setField(term28902, term28902.getClass(), "userReviews", term28927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term28902, args);
    }

};


