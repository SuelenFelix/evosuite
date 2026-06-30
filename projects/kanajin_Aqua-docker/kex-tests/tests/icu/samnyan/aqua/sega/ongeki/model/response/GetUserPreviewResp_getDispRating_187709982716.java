package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_getDispRating_187709982716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6296;

    public GetUserPreviewResp_getDispRating_187709982716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6296 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6296, term6296.getClass(), "userId", -4033544645261759750L);
        setBooleanField(term6296, term6296.getClass(), "isLogin", true);
        setField(term6296, term6296.getClass(), "lastLoginDate", "FlxVmiMYKP");
        setField(term6296, term6296.getClass(), "userName", "");
        setIntField(term6296, term6296.getClass(), "reincarnationNum", 964137425);
        setIntField(term6296, term6296.getClass(), "level", -1378885614);
        setLongField(term6296, term6296.getClass(), "exp", 593230449611047187L);
        setLongField(term6296, term6296.getClass(), "playerRating", -3355167737637002830L);
        setField(term6296, term6296.getClass(), "lastGameId", "");
        setField(term6296, term6296.getClass(), "lastRomVersion", "");
        setField(term6296, term6296.getClass(), "lastDataVersion", "");
        setField(term6296, term6296.getClass(), "lastPlayDate", "fgOpAWlGYN");
        setIntField(term6296, term6296.getClass(), "nameplateId", -1408615666);
        setIntField(term6296, term6296.getClass(), "trophyId", -502299598);
        setIntField(term6296, term6296.getClass(), "cardId", -516287593);
        setIntField(term6296, term6296.getClass(), "dispPlayerLv", -187311406);
        setIntField(term6296, term6296.getClass(), "dispRating", 1496632406);
        setIntField(term6296, term6296.getClass(), "dispBP", 1858277277);
        setIntField(term6296, term6296.getClass(), "headphone", 2145928130);
        setIntField(term6296, term6296.getClass(), "banStatus", -1095947031);
        setBooleanField(term6296, term6296.getClass(), "isWarningConfirmed", true);
        setIntField(term6296, term6296.getClass(), "lastEmoneyBrand", 1504187156);
        setIntField(term6296, term6296.getClass(), "lastEmoneyCredit", -1713723083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRating", argTypes, term6296, args);
    }

};


