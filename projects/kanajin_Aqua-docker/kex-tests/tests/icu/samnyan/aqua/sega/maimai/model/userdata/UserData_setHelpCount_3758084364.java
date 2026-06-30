package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserData_setHelpCount_3758084364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16989;
     Object term17163;

    public UserData_setHelpCount_3758084364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16993 = new Long(-8658027316505137504L);
        term16989 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term16991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17022 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16989, term16989.getClass(), "id", -2255965562447970862L);
        setLongField(term16991, term16991.getClass(), "id", 148047808219672941L);
        setField(term16991, term16991.getClass(), "extId", term16993);
        setField(term16991, term16991.getClass(), "luid", "XXvscsYBWv");
        setIntField(term17008, term17008.getClass(), "year", 2019);
        setShortField(term17008, term17008.getClass(), "month", (short) 6);
        setShortField(term17008, term17008.getClass(), "day", (short) 12);
        setField(term17007, term17007.getClass(), "date", term17008);
        setByteField(term17012, term17012.getClass(), "hour", (byte) 5);
        setByteField(term17012, term17012.getClass(), "minute", (byte) 13);
        setByteField(term17012, term17012.getClass(), "second", (byte) 8);
        setIntField(term17012, term17012.getClass(), "nano", 838117658);
        setField(term17007, term17007.getClass(), "time", term17012);
        setField(term16991, term16991.getClass(), "registerTime", term17007);
        setIntField(term17018, term17018.getClass(), "year", 2014);
        setShortField(term17018, term17018.getClass(), "month", (short) 8);
        setShortField(term17018, term17018.getClass(), "day", (short) 13);
        setField(term17017, term17017.getClass(), "date", term17018);
        setByteField(term17022, term17022.getClass(), "hour", (byte) 13);
        setByteField(term17022, term17022.getClass(), "minute", (byte) 15);
        setByteField(term17022, term17022.getClass(), "second", (byte) 51);
        setIntField(term17022, term17022.getClass(), "nano", 433726678);
        setField(term17017, term17017.getClass(), "time", term17022);
        setField(term16991, term16991.getClass(), "accessTime", term17017);
        setField(term16989, term16989.getClass(), "card", term16991);
        setIntField(term16989, term16989.getClass(), "lastDataVersion", -1234361060);
        setField(term16989, term16989.getClass(), "userName", "uePedtiAfL");
        setIntField(term16989, term16989.getClass(), "point", -267520884);
        setIntField(term16989, term16989.getClass(), "totalPoint", 1431716083);
        setIntField(term16989, term16989.getClass(), "iconId", 1540004680);
        setIntField(term16989, term16989.getClass(), "nameplateId", -594861500);
        setIntField(term16989, term16989.getClass(), "frameId", 1731562923);
        setIntField(term16989, term16989.getClass(), "trophyId", 33467458);
        setIntField(term16989, term16989.getClass(), "playCount", 1729034001);
        setIntField(term16989, term16989.getClass(), "playVsCount", 1094810824);
        setIntField(term16989, term16989.getClass(), "playSyncCount", -1746471324);
        setIntField(term16989, term16989.getClass(), "winCount", 844485803);
        setIntField(term16989, term16989.getClass(), "helpCount", -1373407191);
        setIntField(term16989, term16989.getClass(), "comboCount", 1013516042);
        setIntField(term16989, term16989.getClass(), "feverCount", 284652039);
        setIntField(term16989, term16989.getClass(), "totalHiScore", 1163350537);
        setIntField(term16989, term16989.getClass(), "totalEasyHighScore", -855026181);
        setIntField(term16989, term16989.getClass(), "totalBasicHighScore", 1404243357);
        setIntField(term16989, term16989.getClass(), "totalAdvancedHighScore", -570134327);
        setIntField(term16989, term16989.getClass(), "totalExpertHighScore", 73847121);
        setIntField(term16989, term16989.getClass(), "totalMasterHighScore", 1721050745);
        setIntField(term16989, term16989.getClass(), "totalReMasterHighScore", -1980981205);
        setIntField(term16989, term16989.getClass(), "totalHighSync", -1530498856);
        setIntField(term16989, term16989.getClass(), "totalEasySync", 1816257051);
        setIntField(term16989, term16989.getClass(), "totalBasicSync", -541591725);
        setIntField(term16989, term16989.getClass(), "totalAdvancedSync", 498271385);
        setIntField(term16989, term16989.getClass(), "totalExpertSync", 1418222767);
        setIntField(term16989, term16989.getClass(), "totalMasterSync", 1862441057);
        setIntField(term16989, term16989.getClass(), "totalReMasterSync", 1889814117);
        setIntField(term16989, term16989.getClass(), "playerRating", -1336297368);
        setIntField(term16989, term16989.getClass(), "highestRating", 1535507114);
        setIntField(term16989, term16989.getClass(), "rankAuthTailId", -1174141307);
        setField(term16989, term16989.getClass(), "eventWatchedDate", "AdSHvysxQB");
        setField(term16989, term16989.getClass(), "webLimitDate", "jlraKkBWFA");
        setIntField(term16989, term16989.getClass(), "challengeTrackPhase", -1603957392);
        setIntField(term16989, term16989.getClass(), "firstPlayBits", -287005602);
        setField(term16989, term16989.getClass(), "lastPlayDate", "mRBtFTxVdE");
        setIntField(term16989, term16989.getClass(), "lastPlaceId", 923353564);
        setField(term16989, term16989.getClass(), "lastPlaceName", "IVacFDAZcj");
        setIntField(term16989, term16989.getClass(), "lastRegionId", 2013647768);
        setField(term16989, term16989.getClass(), "lastRegionName", "EEYmuwyVDP");
        setField(term16989, term16989.getClass(), "lastClientId", "EWFbEDAVrE");
        setField(term16989, term16989.getClass(), "lastCountryCode", "EMiMtYgfvr");
        setIntField(term16989, term16989.getClass(), "eventPoint", 1706579212);
        setIntField(term16989, term16989.getClass(), "totalLv", -1073781147);
        setIntField(term16989, term16989.getClass(), "lastLoginBonusDay", 138913824);
        setIntField(term16989, term16989.getClass(), "lastSurvivalBonusDay", -637767208);
        setIntField(term16989, term16989.getClass(), "loginBonusLv", 844890845);
        term17163 = new Integer(-989538894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17163;
        callMethod(klass, "setHelpCount", argTypes, term16989, args);
    }

};


