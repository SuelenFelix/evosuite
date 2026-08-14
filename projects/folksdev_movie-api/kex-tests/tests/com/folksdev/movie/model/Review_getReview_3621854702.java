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
     Object term28901;

    public Review_getReview_3621854702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28928 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28929 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28930 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28931 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28932 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28929, term28929.getClass(), "userId", null);
        setField(term28929, term28929.getClass(), "reviewId", null);
        setField(term28928, term28928.getClass(), "userReviewId", term28929);
        setField(term28930, term28930.getClass(), "id", null);
        setField(term28930, term28930.getClass(), "name", null);
        setField(term28930, term28930.getClass(), "userReviews", null);
        setField(term28928, term28928.getClass(), "user", term28930);
        setField(term28931, term28931.getClass(), "id", null);
        setField(term28931, term28931.getClass(), "review", null);
        setField(term28931, term28931.getClass(), "userReviews", null);
        setField(term28928, term28928.getClass(), "review", term28931);
        setField(term28932, term28932.getClass(), "date", null);
        setField(term28932, term28932.getClass(), "time", null);
        setField(term28928, term28928.getClass(), "date", term28932);
        Object term28933 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28934 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28935 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28936 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28937 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28934, term28934.getClass(), "userId", null);
        setField(term28934, term28934.getClass(), "reviewId", null);
        setField(term28933, term28933.getClass(), "userReviewId", term28934);
        setField(term28935, term28935.getClass(), "id", null);
        setField(term28935, term28935.getClass(), "name", null);
        setField(term28935, term28935.getClass(), "userReviews", null);
        setField(term28933, term28933.getClass(), "user", term28935);
        setField(term28936, term28936.getClass(), "id", null);
        setField(term28936, term28936.getClass(), "review", null);
        setField(term28936, term28936.getClass(), "userReviews", null);
        setField(term28933, term28933.getClass(), "review", term28936);
        setField(term28937, term28937.getClass(), "date", null);
        setField(term28937, term28937.getClass(), "time", null);
        setField(term28933, term28933.getClass(), "date", term28937);
        Object term28938 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28939 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28940 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28941 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28942 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28939, term28939.getClass(), "userId", null);
        setField(term28939, term28939.getClass(), "reviewId", null);
        setField(term28938, term28938.getClass(), "userReviewId", term28939);
        setField(term28940, term28940.getClass(), "id", null);
        setField(term28940, term28940.getClass(), "name", null);
        setField(term28940, term28940.getClass(), "userReviews", null);
        setField(term28938, term28938.getClass(), "user", term28940);
        setField(term28941, term28941.getClass(), "id", null);
        setField(term28941, term28941.getClass(), "review", null);
        setField(term28941, term28941.getClass(), "userReviews", null);
        setField(term28938, term28938.getClass(), "review", term28941);
        setField(term28942, term28942.getClass(), "date", null);
        setField(term28942, term28942.getClass(), "time", null);
        setField(term28938, term28938.getClass(), "date", term28942);
        Object term28943 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28944 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28945 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28946 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28947 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28944, term28944.getClass(), "userId", null);
        setField(term28944, term28944.getClass(), "reviewId", null);
        setField(term28943, term28943.getClass(), "userReviewId", term28944);
        setField(term28945, term28945.getClass(), "id", null);
        setField(term28945, term28945.getClass(), "name", null);
        setField(term28945, term28945.getClass(), "userReviews", null);
        setField(term28943, term28943.getClass(), "user", term28945);
        setField(term28946, term28946.getClass(), "id", null);
        setField(term28946, term28946.getClass(), "review", null);
        setField(term28946, term28946.getClass(), "userReviews", null);
        setField(term28943, term28943.getClass(), "review", term28946);
        setField(term28947, term28947.getClass(), "date", null);
        setField(term28947, term28947.getClass(), "time", null);
        setField(term28943, term28943.getClass(), "date", term28947);
        Object term28948 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28949 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28950 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28951 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28952 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28949, term28949.getClass(), "userId", null);
        setField(term28949, term28949.getClass(), "reviewId", null);
        setField(term28948, term28948.getClass(), "userReviewId", term28949);
        setField(term28950, term28950.getClass(), "id", null);
        setField(term28950, term28950.getClass(), "name", null);
        setField(term28950, term28950.getClass(), "userReviews", null);
        setField(term28948, term28948.getClass(), "user", term28950);
        setField(term28951, term28951.getClass(), "id", null);
        setField(term28951, term28951.getClass(), "review", null);
        setField(term28951, term28951.getClass(), "userReviews", null);
        setField(term28948, term28948.getClass(), "review", term28951);
        setField(term28952, term28952.getClass(), "date", null);
        setField(term28952, term28952.getClass(), "time", null);
        setField(term28948, term28948.getClass(), "date", term28952);
        Object term28953 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28954 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28955 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28956 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28957 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28954, term28954.getClass(), "userId", null);
        setField(term28954, term28954.getClass(), "reviewId", null);
        setField(term28953, term28953.getClass(), "userReviewId", term28954);
        setField(term28955, term28955.getClass(), "id", null);
        setField(term28955, term28955.getClass(), "name", null);
        setField(term28955, term28955.getClass(), "userReviews", null);
        setField(term28953, term28953.getClass(), "user", term28955);
        setField(term28956, term28956.getClass(), "id", null);
        setField(term28956, term28956.getClass(), "review", null);
        setField(term28956, term28956.getClass(), "userReviews", null);
        setField(term28953, term28953.getClass(), "review", term28956);
        setField(term28957, term28957.getClass(), "date", null);
        setField(term28957, term28957.getClass(), "time", null);
        setField(term28953, term28953.getClass(), "date", term28957);
        Object term28958 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28959 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28960 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28961 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28962 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28959, term28959.getClass(), "userId", null);
        setField(term28959, term28959.getClass(), "reviewId", null);
        setField(term28958, term28958.getClass(), "userReviewId", term28959);
        setField(term28960, term28960.getClass(), "id", null);
        setField(term28960, term28960.getClass(), "name", null);
        setField(term28960, term28960.getClass(), "userReviews", null);
        setField(term28958, term28958.getClass(), "user", term28960);
        setField(term28961, term28961.getClass(), "id", null);
        setField(term28961, term28961.getClass(), "review", null);
        setField(term28961, term28961.getClass(), "userReviews", null);
        setField(term28958, term28958.getClass(), "review", term28961);
        setField(term28962, term28962.getClass(), "date", null);
        setField(term28962, term28962.getClass(), "time", null);
        setField(term28958, term28958.getClass(), "date", term28962);
        ArrayList term28926 = new ArrayList();
        ((ArrayList) term28926).add(term28928);
        ((ArrayList) term28926).add(term28933);
        ((ArrayList) term28926).add(term28933);
        ((ArrayList) term28926).add(term28938);
        ((ArrayList) term28926).add(term28943);
        ((ArrayList) term28926).add(term28943);
        ((ArrayList) term28926).add(term28948);
        ((ArrayList) term28926).add(term28953);
        ((ArrayList) term28926).add(term28958);
        term28901 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28901, term28901.getClass(), "id", "CLVzSrhOjS");
        setField(term28901, term28901.getClass(), "review", "OrrgHDCMip");
        setField(term28901, term28901.getClass(), "userReviews", term28926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term28901, args);
    }

};


