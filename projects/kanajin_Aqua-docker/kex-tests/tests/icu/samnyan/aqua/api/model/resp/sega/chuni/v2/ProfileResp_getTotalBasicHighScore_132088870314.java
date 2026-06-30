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

public class ProfileResp_getTotalBasicHighScore_132088870314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116953;

    public ProfileResp_getTotalBasicHighScore_132088870314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116953 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117011 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116953, term116953.getClass(), "userName", "jBNkgaLRsS");
        setIntField(term116953, term116953.getClass(), "level", 551771322);
        setField(term116953, term116953.getClass(), "exp", "PehUNmWvHv");
        setLongField(term116953, term116953.getClass(), "point", 5949346262141455534L);
        setLongField(term116953, term116953.getClass(), "totalPoint", 5155927928131240719L);
        setIntField(term116953, term116953.getClass(), "playCount", 648007204);
        setIntField(term116953, term116953.getClass(), "playerRating", -2052173354);
        setIntField(term116953, term116953.getClass(), "highestRating", 1273199469);
        setIntField(term116953, term116953.getClass(), "nameplateId", 2061225700);
        setIntField(term116953, term116953.getClass(), "frameId", -1921671205);
        setIntField(term116953, term116953.getClass(), "characterId", 98392305);
        setIntField(term116953, term116953.getClass(), "trophyId", -1201945710);
        setIntField(term116953, term116953.getClass(), "totalMapNum", -932928619);
        setLongField(term116953, term116953.getClass(), "totalHiScore", -8844767764674347924L);
        setLongField(term116953, term116953.getClass(), "totalBasicHighScore", -7722777465873209662L);
        setLongField(term116953, term116953.getClass(), "totalAdvancedHighScore", -2902907230526864306L);
        setLongField(term116953, term116953.getClass(), "totalExpertHighScore", 6654919972937561484L);
        setLongField(term116953, term116953.getClass(), "totalMasterHighScore", -8728361429528711927L);
        setLongField(term116953, term116953.getClass(), "totalUltimaHighScore", 6121525178540002640L);
        setIntField(term116953, term116953.getClass(), "friendCount", -681960045);
        setIntField(term116997, term116997.getClass(), "year", 2020);
        setShortField(term116997, term116997.getClass(), "month", (short) 2);
        setShortField(term116997, term116997.getClass(), "day", (short) 4);
        setField(term116996, term116996.getClass(), "date", term116997);
        setByteField(term117001, term117001.getClass(), "hour", (byte) 7);
        setByteField(term117001, term117001.getClass(), "minute", (byte) 4);
        setByteField(term117001, term117001.getClass(), "second", (byte) 50);
        setIntField(term117001, term117001.getClass(), "nano", 70933448);
        setField(term116996, term116996.getClass(), "time", term117001);
        setField(term116953, term116953.getClass(), "firstPlayDate", term116996);
        setIntField(term117007, term117007.getClass(), "year", 2021);
        setShortField(term117007, term117007.getClass(), "month", (short) 11);
        setShortField(term117007, term117007.getClass(), "day", (short) 12);
        setField(term117006, term117006.getClass(), "date", term117007);
        setByteField(term117011, term117011.getClass(), "hour", (byte) 8);
        setByteField(term117011, term117011.getClass(), "minute", (byte) 23);
        setByteField(term117011, term117011.getClass(), "second", (byte) 53);
        setIntField(term117011, term117011.getClass(), "nano", 668949390);
        setField(term117006, term117006.getClass(), "time", term117011);
        setField(term116953, term116953.getClass(), "lastPlayDate", term117006);
        setIntField(term116953, term116953.getClass(), "courseClass", -1433959202);
        setIntField(term116953, term116953.getClass(), "overPowerPoint", -112677517);
        setIntField(term116953, term116953.getClass(), "overPowerRate", 1339161583);
        setIntField(term116953, term116953.getClass(), "mapIconId", 1876434326);
        setIntField(term116953, term116953.getClass(), "voiceId", -6731475);
        setIntField(term116953, term116953.getClass(), "avatarWear", 325359871);
        setIntField(term116953, term116953.getClass(), "avatarHead", 1938712559);
        setIntField(term116953, term116953.getClass(), "avatarFace", -1251616718);
        setIntField(term116953, term116953.getClass(), "avatarSkin", 1224674572);
        setIntField(term116953, term116953.getClass(), "avatarItem", -857662783);
        setIntField(term116953, term116953.getClass(), "avatarFront", -1866763586);
        setIntField(term116953, term116953.getClass(), "avatarBack", 927211383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term116953, args);
    }

};


