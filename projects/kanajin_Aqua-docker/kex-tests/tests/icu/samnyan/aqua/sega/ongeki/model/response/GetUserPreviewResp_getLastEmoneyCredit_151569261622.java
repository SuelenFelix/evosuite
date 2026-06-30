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

public class GetUserPreviewResp_getLastEmoneyCredit_151569261622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6716;

    public GetUserPreviewResp_getLastEmoneyCredit_151569261622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6716 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6716, term6716.getClass(), "userId", 4832511106024339541L);
        setBooleanField(term6716, term6716.getClass(), "isLogin", false);
        setField(term6716, term6716.getClass(), "lastLoginDate", "QUymMnsCIj");
        setField(term6716, term6716.getClass(), "userName", "");
        setIntField(term6716, term6716.getClass(), "reincarnationNum", 158801111);
        setIntField(term6716, term6716.getClass(), "level", 464966803);
        setLongField(term6716, term6716.getClass(), "exp", 7840243516767232066L);
        setLongField(term6716, term6716.getClass(), "playerRating", -4069312743655862444L);
        setField(term6716, term6716.getClass(), "lastGameId", "");
        setField(term6716, term6716.getClass(), "lastRomVersion", "");
        setField(term6716, term6716.getClass(), "lastDataVersion", "");
        setField(term6716, term6716.getClass(), "lastPlayDate", "ikTtOgdVYS");
        setIntField(term6716, term6716.getClass(), "nameplateId", -246618392);
        setIntField(term6716, term6716.getClass(), "trophyId", 1472246167);
        setIntField(term6716, term6716.getClass(), "cardId", 1008555478);
        setIntField(term6716, term6716.getClass(), "dispPlayerLv", 1346386442);
        setIntField(term6716, term6716.getClass(), "dispRating", 1904559758);
        setIntField(term6716, term6716.getClass(), "dispBP", 610850630);
        setIntField(term6716, term6716.getClass(), "headphone", 170509161);
        setIntField(term6716, term6716.getClass(), "banStatus", 491497994);
        setBooleanField(term6716, term6716.getClass(), "isWarningConfirmed", true);
        setIntField(term6716, term6716.getClass(), "lastEmoneyBrand", 1997288643);
        setIntField(term6716, term6716.getClass(), "lastEmoneyCredit", -378961519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastEmoneyCredit", argTypes, term6716, args);
    }

};


