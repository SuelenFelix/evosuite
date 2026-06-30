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

public class ProfileResp_getTrophyId_112581854411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116668;

    public ProfileResp_getTrophyId_112581854411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116668 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116726 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116668, term116668.getClass(), "userName", "zNytLLNNRg");
        setIntField(term116668, term116668.getClass(), "level", -1274134127);
        setField(term116668, term116668.getClass(), "exp", "zsWqPYKhbS");
        setLongField(term116668, term116668.getClass(), "point", 4174829442572031490L);
        setLongField(term116668, term116668.getClass(), "totalPoint", 2367151330312860304L);
        setIntField(term116668, term116668.getClass(), "playCount", -1813762607);
        setIntField(term116668, term116668.getClass(), "playerRating", -1731142983);
        setIntField(term116668, term116668.getClass(), "highestRating", -795706625);
        setIntField(term116668, term116668.getClass(), "nameplateId", -1671839521);
        setIntField(term116668, term116668.getClass(), "frameId", -1429201577);
        setIntField(term116668, term116668.getClass(), "characterId", 938131020);
        setIntField(term116668, term116668.getClass(), "trophyId", -1538092029);
        setIntField(term116668, term116668.getClass(), "totalMapNum", 1330831699);
        setLongField(term116668, term116668.getClass(), "totalHiScore", -1065508751068921341L);
        setLongField(term116668, term116668.getClass(), "totalBasicHighScore", 1995963122877236843L);
        setLongField(term116668, term116668.getClass(), "totalAdvancedHighScore", 2344313633784181426L);
        setLongField(term116668, term116668.getClass(), "totalExpertHighScore", 3902294446119073387L);
        setLongField(term116668, term116668.getClass(), "totalMasterHighScore", 7287540206619376802L);
        setLongField(term116668, term116668.getClass(), "totalUltimaHighScore", 2642016550674620442L);
        setIntField(term116668, term116668.getClass(), "friendCount", 1345525655);
        setIntField(term116712, term116712.getClass(), "year", 2013);
        setShortField(term116712, term116712.getClass(), "month", (short) 2);
        setShortField(term116712, term116712.getClass(), "day", (short) 25);
        setField(term116711, term116711.getClass(), "date", term116712);
        setByteField(term116716, term116716.getClass(), "hour", (byte) 14);
        setByteField(term116716, term116716.getClass(), "minute", (byte) 38);
        setByteField(term116716, term116716.getClass(), "second", (byte) 52);
        setIntField(term116716, term116716.getClass(), "nano", 590698413);
        setField(term116711, term116711.getClass(), "time", term116716);
        setField(term116668, term116668.getClass(), "firstPlayDate", term116711);
        setIntField(term116722, term116722.getClass(), "year", 2025);
        setShortField(term116722, term116722.getClass(), "month", (short) 3);
        setShortField(term116722, term116722.getClass(), "day", (short) 6);
        setField(term116721, term116721.getClass(), "date", term116722);
        setByteField(term116726, term116726.getClass(), "hour", (byte) 13);
        setByteField(term116726, term116726.getClass(), "minute", (byte) 35);
        setByteField(term116726, term116726.getClass(), "second", (byte) 30);
        setIntField(term116726, term116726.getClass(), "nano", 932610206);
        setField(term116721, term116721.getClass(), "time", term116726);
        setField(term116668, term116668.getClass(), "lastPlayDate", term116721);
        setIntField(term116668, term116668.getClass(), "courseClass", 550368994);
        setIntField(term116668, term116668.getClass(), "overPowerPoint", -1262637917);
        setIntField(term116668, term116668.getClass(), "overPowerRate", 1667464004);
        setIntField(term116668, term116668.getClass(), "mapIconId", -325769017);
        setIntField(term116668, term116668.getClass(), "voiceId", 168499370);
        setIntField(term116668, term116668.getClass(), "avatarWear", -41394359);
        setIntField(term116668, term116668.getClass(), "avatarHead", 1581361711);
        setIntField(term116668, term116668.getClass(), "avatarFace", -2114242479);
        setIntField(term116668, term116668.getClass(), "avatarSkin", -1831744659);
        setIntField(term116668, term116668.getClass(), "avatarItem", -1467658722);
        setIntField(term116668, term116668.getClass(), "avatarFront", -2145480725);
        setIntField(term116668, term116668.getClass(), "avatarBack", 1042341373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term116668, args);
    }

};


