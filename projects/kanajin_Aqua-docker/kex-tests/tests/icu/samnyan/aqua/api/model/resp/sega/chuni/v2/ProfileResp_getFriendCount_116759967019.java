package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getFriendCount_116759967019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117428;

    public ProfileResp_getFriendCount_116759967019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117428 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117486 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117428, term117428.getClass(), "userName", "RUlqnYyZPt");
        setIntField(term117428, term117428.getClass(), "level", -1102437658);
        setField(term117428, term117428.getClass(), "exp", "COBVzmryOp");
        setLongField(term117428, term117428.getClass(), "point", 1064707213332578186L);
        setLongField(term117428, term117428.getClass(), "totalPoint", 8450625741710194467L);
        setIntField(term117428, term117428.getClass(), "playCount", -218461763);
        setIntField(term117428, term117428.getClass(), "playerRating", 1090755807);
        setIntField(term117428, term117428.getClass(), "highestRating", 1450419831);
        setIntField(term117428, term117428.getClass(), "nameplateId", 1458501009);
        setIntField(term117428, term117428.getClass(), "frameId", 1893379323);
        setIntField(term117428, term117428.getClass(), "characterId", -988218450);
        setIntField(term117428, term117428.getClass(), "trophyId", -490454236);
        setIntField(term117428, term117428.getClass(), "totalMapNum", 2120589337);
        setLongField(term117428, term117428.getClass(), "totalHiScore", 5301845140827278235L);
        setLongField(term117428, term117428.getClass(), "totalBasicHighScore", -2293526197698880438L);
        setLongField(term117428, term117428.getClass(), "totalAdvancedHighScore", -7542520442432811164L);
        setLongField(term117428, term117428.getClass(), "totalExpertHighScore", 786188601032302867L);
        setLongField(term117428, term117428.getClass(), "totalMasterHighScore", -6815616200339425410L);
        setLongField(term117428, term117428.getClass(), "totalUltimaHighScore", -8594295939316003249L);
        setIntField(term117428, term117428.getClass(), "friendCount", -2144900909);
        setIntField(term117472, term117472.getClass(), "year", 2011);
        setShortField(term117472, term117472.getClass(), "month", (short) 5);
        setShortField(term117472, term117472.getClass(), "day", (short) 2);
        setField(term117471, term117471.getClass(), "date", term117472);
        setByteField(term117476, term117476.getClass(), "hour", (byte) 12);
        setByteField(term117476, term117476.getClass(), "minute", (byte) 23);
        setByteField(term117476, term117476.getClass(), "second", (byte) 29);
        setIntField(term117476, term117476.getClass(), "nano", 119154387);
        setField(term117471, term117471.getClass(), "time", term117476);
        setField(term117428, term117428.getClass(), "firstPlayDate", term117471);
        setIntField(term117482, term117482.getClass(), "year", 2029);
        setShortField(term117482, term117482.getClass(), "month", (short) 7);
        setShortField(term117482, term117482.getClass(), "day", (short) 10);
        setField(term117481, term117481.getClass(), "date", term117482);
        setByteField(term117486, term117486.getClass(), "hour", (byte) 11);
        setByteField(term117486, term117486.getClass(), "minute", (byte) 39);
        setByteField(term117486, term117486.getClass(), "second", (byte) 41);
        setIntField(term117486, term117486.getClass(), "nano", 492639061);
        setField(term117481, term117481.getClass(), "time", term117486);
        setField(term117428, term117428.getClass(), "lastPlayDate", term117481);
        setIntField(term117428, term117428.getClass(), "courseClass", -2034289076);
        setIntField(term117428, term117428.getClass(), "overPowerPoint", -1442588810);
        setIntField(term117428, term117428.getClass(), "overPowerRate", 199752378);
        setIntField(term117428, term117428.getClass(), "mapIconId", 1020676311);
        setIntField(term117428, term117428.getClass(), "voiceId", 1417010342);
        setIntField(term117428, term117428.getClass(), "avatarWear", 1156171818);
        setIntField(term117428, term117428.getClass(), "avatarHead", 1604769863);
        setIntField(term117428, term117428.getClass(), "avatarFace", 1712877180);
        setIntField(term117428, term117428.getClass(), "avatarSkin", 562769715);
        setIntField(term117428, term117428.getClass(), "avatarItem", -1362037783);
        setIntField(term117428, term117428.getClass(), "avatarFront", -1175007135);
        setIntField(term117428, term117428.getClass(), "avatarBack", 973562180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendCount", argTypes, term117428, args);
    }

};


