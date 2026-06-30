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

public class UserData_setNameplateId_49345184357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15127;
     Object term15301;

    public UserData_setNameplateId_49345184357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15131 = new Long(-3838084482494604218L);
        term15127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term15129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15127, term15127.getClass(), "id", -4393710401270724527L);
        setLongField(term15129, term15129.getClass(), "id", -4822736661741380518L);
        setField(term15129, term15129.getClass(), "extId", term15131);
        setField(term15129, term15129.getClass(), "luid", "ceCWHUTQUM");
        setIntField(term15146, term15146.getClass(), "year", 2022);
        setShortField(term15146, term15146.getClass(), "month", (short) 11);
        setShortField(term15146, term15146.getClass(), "day", (short) 5);
        setField(term15145, term15145.getClass(), "date", term15146);
        setByteField(term15150, term15150.getClass(), "hour", (byte) 0);
        setByteField(term15150, term15150.getClass(), "minute", (byte) 51);
        setByteField(term15150, term15150.getClass(), "second", (byte) 23);
        setIntField(term15150, term15150.getClass(), "nano", 1140962);
        setField(term15145, term15145.getClass(), "time", term15150);
        setField(term15129, term15129.getClass(), "registerTime", term15145);
        setIntField(term15156, term15156.getClass(), "year", 2020);
        setShortField(term15156, term15156.getClass(), "month", (short) 5);
        setShortField(term15156, term15156.getClass(), "day", (short) 24);
        setField(term15155, term15155.getClass(), "date", term15156);
        setByteField(term15160, term15160.getClass(), "hour", (byte) 2);
        setByteField(term15160, term15160.getClass(), "minute", (byte) 9);
        setByteField(term15160, term15160.getClass(), "second", (byte) 52);
        setIntField(term15160, term15160.getClass(), "nano", 653329393);
        setField(term15155, term15155.getClass(), "time", term15160);
        setField(term15129, term15129.getClass(), "accessTime", term15155);
        setField(term15127, term15127.getClass(), "card", term15129);
        setIntField(term15127, term15127.getClass(), "lastDataVersion", -1683274691);
        setField(term15127, term15127.getClass(), "userName", "LrqwfrKKtS");
        setIntField(term15127, term15127.getClass(), "point", -935900044);
        setIntField(term15127, term15127.getClass(), "totalPoint", 1747876558);
        setIntField(term15127, term15127.getClass(), "iconId", 833477776);
        setIntField(term15127, term15127.getClass(), "nameplateId", 2043960707);
        setIntField(term15127, term15127.getClass(), "frameId", 272179554);
        setIntField(term15127, term15127.getClass(), "trophyId", 1717711536);
        setIntField(term15127, term15127.getClass(), "playCount", -606339607);
        setIntField(term15127, term15127.getClass(), "playVsCount", 800440712);
        setIntField(term15127, term15127.getClass(), "playSyncCount", -1976407622);
        setIntField(term15127, term15127.getClass(), "winCount", -552996061);
        setIntField(term15127, term15127.getClass(), "helpCount", -153013117);
        setIntField(term15127, term15127.getClass(), "comboCount", 712181359);
        setIntField(term15127, term15127.getClass(), "feverCount", -1943255435);
        setIntField(term15127, term15127.getClass(), "totalHiScore", 868436312);
        setIntField(term15127, term15127.getClass(), "totalEasyHighScore", 1737963071);
        setIntField(term15127, term15127.getClass(), "totalBasicHighScore", 6456997);
        setIntField(term15127, term15127.getClass(), "totalAdvancedHighScore", -797269627);
        setIntField(term15127, term15127.getClass(), "totalExpertHighScore", -224331928);
        setIntField(term15127, term15127.getClass(), "totalMasterHighScore", -587857163);
        setIntField(term15127, term15127.getClass(), "totalReMasterHighScore", -2018093075);
        setIntField(term15127, term15127.getClass(), "totalHighSync", 135879009);
        setIntField(term15127, term15127.getClass(), "totalEasySync", 1923027847);
        setIntField(term15127, term15127.getClass(), "totalBasicSync", -1652693609);
        setIntField(term15127, term15127.getClass(), "totalAdvancedSync", -824893512);
        setIntField(term15127, term15127.getClass(), "totalExpertSync", -55435071);
        setIntField(term15127, term15127.getClass(), "totalMasterSync", -673356166);
        setIntField(term15127, term15127.getClass(), "totalReMasterSync", 1876812694);
        setIntField(term15127, term15127.getClass(), "playerRating", 461068473);
        setIntField(term15127, term15127.getClass(), "highestRating", -1833298266);
        setIntField(term15127, term15127.getClass(), "rankAuthTailId", 746372422);
        setField(term15127, term15127.getClass(), "eventWatchedDate", "ZUdnQXfzCI");
        setField(term15127, term15127.getClass(), "webLimitDate", "EULDrUNQvw");
        setIntField(term15127, term15127.getClass(), "challengeTrackPhase", 1921465988);
        setIntField(term15127, term15127.getClass(), "firstPlayBits", -164438599);
        setField(term15127, term15127.getClass(), "lastPlayDate", "BtvAvsJSei");
        setIntField(term15127, term15127.getClass(), "lastPlaceId", -444441955);
        setField(term15127, term15127.getClass(), "lastPlaceName", "vqnBkkxoIa");
        setIntField(term15127, term15127.getClass(), "lastRegionId", -544005591);
        setField(term15127, term15127.getClass(), "lastRegionName", "bycpZjxXFn");
        setField(term15127, term15127.getClass(), "lastClientId", "jQWttOAiwL");
        setField(term15127, term15127.getClass(), "lastCountryCode", "DzKFxEuEEC");
        setIntField(term15127, term15127.getClass(), "eventPoint", -1379603462);
        setIntField(term15127, term15127.getClass(), "totalLv", -1304965721);
        setIntField(term15127, term15127.getClass(), "lastLoginBonusDay", 1661411651);
        setIntField(term15127, term15127.getClass(), "lastSurvivalBonusDay", 175517901);
        setIntField(term15127, term15127.getClass(), "loginBonusLv", 335030203);
        term15301 = new Integer(-474014477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15301;
        callMethod(klass, "setNameplateId", argTypes, term15127, args);
    }

};


