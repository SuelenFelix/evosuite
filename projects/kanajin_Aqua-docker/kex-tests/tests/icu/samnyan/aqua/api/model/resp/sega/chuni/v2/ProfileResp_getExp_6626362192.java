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

public class ProfileResp_getExp_6626362192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115813;

    public ProfileResp_getExp_6626362192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115813 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term115856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115871 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term115813, term115813.getClass(), "userName", "wZnhIfXRJr");
        setIntField(term115813, term115813.getClass(), "level", 636621511);
        setField(term115813, term115813.getClass(), "exp", "QIILqPYYAT");
        setLongField(term115813, term115813.getClass(), "point", 5181335103536619869L);
        setLongField(term115813, term115813.getClass(), "totalPoint", 1928896533909360947L);
        setIntField(term115813, term115813.getClass(), "playCount", 636482733);
        setIntField(term115813, term115813.getClass(), "playerRating", 1403773895);
        setIntField(term115813, term115813.getClass(), "highestRating", 1455379621);
        setIntField(term115813, term115813.getClass(), "nameplateId", 191704271);
        setIntField(term115813, term115813.getClass(), "frameId", -1903944891);
        setIntField(term115813, term115813.getClass(), "characterId", -8519008);
        setIntField(term115813, term115813.getClass(), "trophyId", -1502641245);
        setIntField(term115813, term115813.getClass(), "totalMapNum", 1357396647);
        setLongField(term115813, term115813.getClass(), "totalHiScore", -1584438896384760865L);
        setLongField(term115813, term115813.getClass(), "totalBasicHighScore", 8193875437648988569L);
        setLongField(term115813, term115813.getClass(), "totalAdvancedHighScore", 4379641673357845191L);
        setLongField(term115813, term115813.getClass(), "totalExpertHighScore", 448875090764705066L);
        setLongField(term115813, term115813.getClass(), "totalMasterHighScore", -3628350199087571008L);
        setLongField(term115813, term115813.getClass(), "totalUltimaHighScore", 1727677323845860831L);
        setIntField(term115813, term115813.getClass(), "friendCount", 207721868);
        setIntField(term115857, term115857.getClass(), "year", 2018);
        setShortField(term115857, term115857.getClass(), "month", (short) 8);
        setShortField(term115857, term115857.getClass(), "day", (short) 22);
        setField(term115856, term115856.getClass(), "date", term115857);
        setByteField(term115861, term115861.getClass(), "hour", (byte) 22);
        setByteField(term115861, term115861.getClass(), "minute", (byte) 51);
        setByteField(term115861, term115861.getClass(), "second", (byte) 57);
        setIntField(term115861, term115861.getClass(), "nano", 405546718);
        setField(term115856, term115856.getClass(), "time", term115861);
        setField(term115813, term115813.getClass(), "firstPlayDate", term115856);
        setIntField(term115867, term115867.getClass(), "year", 2027);
        setShortField(term115867, term115867.getClass(), "month", (short) 8);
        setShortField(term115867, term115867.getClass(), "day", (short) 16);
        setField(term115866, term115866.getClass(), "date", term115867);
        setByteField(term115871, term115871.getClass(), "hour", (byte) 9);
        setByteField(term115871, term115871.getClass(), "minute", (byte) 49);
        setByteField(term115871, term115871.getClass(), "second", (byte) 5);
        setIntField(term115871, term115871.getClass(), "nano", 735953904);
        setField(term115866, term115866.getClass(), "time", term115871);
        setField(term115813, term115813.getClass(), "lastPlayDate", term115866);
        setIntField(term115813, term115813.getClass(), "courseClass", -2054965194);
        setIntField(term115813, term115813.getClass(), "overPowerPoint", -1002114197);
        setIntField(term115813, term115813.getClass(), "overPowerRate", 1699918315);
        setIntField(term115813, term115813.getClass(), "mapIconId", -1608689014);
        setIntField(term115813, term115813.getClass(), "voiceId", 1178328303);
        setIntField(term115813, term115813.getClass(), "avatarWear", 1471726547);
        setIntField(term115813, term115813.getClass(), "avatarHead", -2128423639);
        setIntField(term115813, term115813.getClass(), "avatarFace", -1732680834);
        setIntField(term115813, term115813.getClass(), "avatarSkin", 166249637);
        setIntField(term115813, term115813.getClass(), "avatarItem", -685232057);
        setIntField(term115813, term115813.getClass(), "avatarFront", 1661405620);
        setIntField(term115813, term115813.getClass(), "avatarBack", 900902694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term115813, args);
    }

};


