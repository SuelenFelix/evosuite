package com.alkemy.ong.application.service.comment;

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
import static com.alkemy.ong.application.service.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class CreateCommentUseCaseService_create_5822205080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1081;
     Object term1082;

    public CreateCommentUseCaseService_create_5822205080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1081 = newInstance(Class.forName("com.alkemy.ong.application.service.comment.CreateCommentUseCaseService"));
        setField(term1081, term1081.getClass(), "commentRepository", null);
        setField(term1081, term1081.getClass(), "userRepository", null);
        setField(term1081, term1081.getClass(), "newsRepository", null);
        Long term1083 = new Long(7862575738391801707L);
        Long term1098 = new Long(50358265865610362L);
        Long term1161 = new Long(5510783420697225605L);
        Long term1200 = new Long(6005241913654469005L);
        Long term1239 = new Long(-1983291584002806658L);
        Long term1280 = new Long(5946780097489996391L);
        Object term1279 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1279, term1279.getClass(), "id", term1280);
        setField(term1279, term1279.getClass(), "body", null);
        setField(term1279, term1279.getClass(), "createdBy", null);
        setField(term1279, term1279.getClass(), "associatedNews", null);
        setField(term1279, term1279.getClass(), "createTimestamp", null);
        Long term1283 = new Long(1672578078364590450L);
        Object term1282 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1282, term1282.getClass(), "id", term1283);
        setField(term1282, term1282.getClass(), "body", null);
        setField(term1282, term1282.getClass(), "createdBy", null);
        setField(term1282, term1282.getClass(), "associatedNews", null);
        setField(term1282, term1282.getClass(), "createTimestamp", null);
        Object term1285 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1285, term1285.getClass(), "id", null);
        setField(term1285, term1285.getClass(), "body", null);
        setField(term1285, term1285.getClass(), "createdBy", null);
        setField(term1285, term1285.getClass(), "associatedNews", null);
        setField(term1285, term1285.getClass(), "createTimestamp", null);
        Object term1286 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1286, term1286.getClass(), "id", null);
        setField(term1286, term1286.getClass(), "body", null);
        setField(term1286, term1286.getClass(), "createdBy", null);
        setField(term1286, term1286.getClass(), "associatedNews", null);
        setField(term1286, term1286.getClass(), "createTimestamp", null);
        Object term1287 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1287, term1287.getClass(), "id", null);
        setField(term1287, term1287.getClass(), "body", null);
        setField(term1287, term1287.getClass(), "createdBy", null);
        setField(term1287, term1287.getClass(), "associatedNews", null);
        setField(term1287, term1287.getClass(), "createTimestamp", null);
        Long term1289 = new Long(-8876856890348836498L);
        Object term1288 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1288, term1288.getClass(), "id", term1289);
        setField(term1288, term1288.getClass(), "body", null);
        setField(term1288, term1288.getClass(), "createdBy", null);
        setField(term1288, term1288.getClass(), "associatedNews", null);
        setField(term1288, term1288.getClass(), "createTimestamp", null);
        ArrayList term1277 = new ArrayList();
        ((ArrayList) term1277).add(term1279);
        ((ArrayList) term1277).add(term1282);
        ((ArrayList) term1277).add(term1285);
        ((ArrayList) term1277).add(term1286);
        ((ArrayList) term1277).add(term1287);
        ((ArrayList) term1277).add(term1288);
        ((ArrayList) term1277).add(term1282);
        ((ArrayList) term1277).add(term1286);
        term1082 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term1097 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1160 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term1199 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term1238 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term1293 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1082, term1082.getClass(), "id", term1083);
        setField(term1082, term1082.getClass(), "body", "iIRsCSYqXH");
        setField(term1097, term1097.getClass(), "id", term1098);
        setField(term1097, term1097.getClass(), "firstName", "nghfqDXyCG");
        setField(term1097, term1097.getClass(), "lastName", "WBAOTqErtm");
        setField(term1097, term1097.getClass(), "email", "PqtVXXZMqK");
        setField(term1097, term1097.getClass(), "password", "rYbtIDVdnd");
        setField(term1097, term1097.getClass(), "imageUrl", "UKAReurpHG");
        setField(term1160, term1160.getClass(), "id", term1161);
        setField(term1160, term1160.getClass(), "name", "WVRMUmrljA");
        setField(term1160, term1160.getClass(), "description", "NTlKJDDWlk");
        setField(term1097, term1097.getClass(), "role", term1160);
        setField(term1097, term1097.getClass(), "token", "vOuMEpOQAg");
        setField(term1082, term1082.getClass(), "createdBy", term1097);
        setField(term1199, term1199.getClass(), "id", term1200);
        setField(term1199, term1199.getClass(), "name", "SIODFGaQhr");
        setField(term1199, term1199.getClass(), "content", "qYzsiuXOgS");
        setField(term1199, term1199.getClass(), "imageUrl", "bxrCBbrrct");
        setField(term1238, term1238.getClass(), "id", term1239);
        setField(term1238, term1238.getClass(), "name", "CKWpJaaaxX");
        setField(term1238, term1238.getClass(), "description", "UBRmXJmfrt");
        setField(term1238, term1238.getClass(), "imageUrl", "WZzvmIHhzZ");
        setField(term1199, term1199.getClass(), "category", term1238);
        setField(term1199, term1199.getClass(), "comments", term1277);
        setField(term1082, term1082.getClass(), "associatedNews", term1199);
        setIntField(term1293, term1293.getClass(), "nanos", 394000000);
        setLongField(term1293, term1293.getClass(), "fastTime", 1538068116000L);
        setField(term1293, term1293.getClass(), "cdate", null);
        setField(term1082, term1082.getClass(), "createTimestamp", term1293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.comment.CreateCommentUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term1082;
        callMethod(klass, "create", argTypes, term1081, args);
    }

};


