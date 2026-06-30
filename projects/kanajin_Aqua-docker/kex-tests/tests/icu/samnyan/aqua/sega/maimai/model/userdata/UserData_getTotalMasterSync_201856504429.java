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

public class UserData_getTotalMasterSync_201856504429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7657;

    public UserData_getTotalMasterSync_201856504429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7661 = new Long(2120084523938730454L);
        term7657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term7659 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7690 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7657, term7657.getClass(), "id", -3838084482494604218L);
        setLongField(term7659, term7659.getClass(), "id", 3892018155439224435L);
        setField(term7659, term7659.getClass(), "extId", term7661);
        setField(term7659, term7659.getClass(), "luid", "WVbxuoDBcn");
        setIntField(term7676, term7676.getClass(), "year", 2025);
        setShortField(term7676, term7676.getClass(), "month", (short) 3);
        setShortField(term7676, term7676.getClass(), "day", (short) 28);
        setField(term7675, term7675.getClass(), "date", term7676);
        setByteField(term7680, term7680.getClass(), "hour", (byte) 19);
        setByteField(term7680, term7680.getClass(), "minute", (byte) 56);
        setByteField(term7680, term7680.getClass(), "second", (byte) 52);
        setIntField(term7680, term7680.getClass(), "nano", 738558930);
        setField(term7675, term7675.getClass(), "time", term7680);
        setField(term7659, term7659.getClass(), "registerTime", term7675);
        setIntField(term7686, term7686.getClass(), "year", 2024);
        setShortField(term7686, term7686.getClass(), "month", (short) 2);
        setShortField(term7686, term7686.getClass(), "day", (short) 29);
        setField(term7685, term7685.getClass(), "date", term7686);
        setByteField(term7690, term7690.getClass(), "hour", (byte) 17);
        setByteField(term7690, term7690.getClass(), "minute", (byte) 54);
        setByteField(term7690, term7690.getClass(), "second", (byte) 21);
        setIntField(term7690, term7690.getClass(), "nano", 605973408);
        setField(term7685, term7685.getClass(), "time", term7690);
        setField(term7659, term7659.getClass(), "accessTime", term7685);
        setField(term7657, term7657.getClass(), "card", term7659);
        setIntField(term7657, term7657.getClass(), "lastDataVersion", -561851867);
        setField(term7657, term7657.getClass(), "userName", "pvDEABOxLt");
        setIntField(term7657, term7657.getClass(), "point", -1809928454);
        setIntField(term7657, term7657.getClass(), "totalPoint", -191639503);
        setIntField(term7657, term7657.getClass(), "iconId", -1563700756);
        setIntField(term7657, term7657.getClass(), "nameplateId", -208314837);
        setIntField(term7657, term7657.getClass(), "frameId", 697841387);
        setIntField(term7657, term7657.getClass(), "trophyId", -1749591213);
        setIntField(term7657, term7657.getClass(), "playCount", 1703093401);
        setIntField(term7657, term7657.getClass(), "playVsCount", 47607734);
        setIntField(term7657, term7657.getClass(), "playSyncCount", 1717232691);
        setIntField(term7657, term7657.getClass(), "winCount", -938127737);
        setIntField(term7657, term7657.getClass(), "helpCount", -1408678076);
        setIntField(term7657, term7657.getClass(), "comboCount", 1201413899);
        setIntField(term7657, term7657.getClass(), "feverCount", -376722373);
        setIntField(term7657, term7657.getClass(), "totalHiScore", 1180687854);
        setIntField(term7657, term7657.getClass(), "totalEasyHighScore", 328631288);
        setIntField(term7657, term7657.getClass(), "totalBasicHighScore", -1631415805);
        setIntField(term7657, term7657.getClass(), "totalAdvancedHighScore", 1073400519);
        setIntField(term7657, term7657.getClass(), "totalExpertHighScore", -2025555268);
        setIntField(term7657, term7657.getClass(), "totalMasterHighScore", -746950289);
        setIntField(term7657, term7657.getClass(), "totalReMasterHighScore", -137577510);
        setIntField(term7657, term7657.getClass(), "totalHighSync", 719185716);
        setIntField(term7657, term7657.getClass(), "totalEasySync", 1624820010);
        setIntField(term7657, term7657.getClass(), "totalBasicSync", -831921156);
        setIntField(term7657, term7657.getClass(), "totalAdvancedSync", -2085566906);
        setIntField(term7657, term7657.getClass(), "totalExpertSync", 1773193728);
        setIntField(term7657, term7657.getClass(), "totalMasterSync", -1341357647);
        setIntField(term7657, term7657.getClass(), "totalReMasterSync", 138447019);
        setIntField(term7657, term7657.getClass(), "playerRating", 114915275);
        setIntField(term7657, term7657.getClass(), "highestRating", 338519695);
        setIntField(term7657, term7657.getClass(), "rankAuthTailId", 2025566580);
        setField(term7657, term7657.getClass(), "eventWatchedDate", "beAMpkroCQ");
        setField(term7657, term7657.getClass(), "webLimitDate", "uSUvKAyuvd");
        setIntField(term7657, term7657.getClass(), "challengeTrackPhase", -1231122778);
        setIntField(term7657, term7657.getClass(), "firstPlayBits", 1923558221);
        setField(term7657, term7657.getClass(), "lastPlayDate", "onQLVONGuf");
        setIntField(term7657, term7657.getClass(), "lastPlaceId", 1762934060);
        setField(term7657, term7657.getClass(), "lastPlaceName", "SOrEHbcbmn");
        setIntField(term7657, term7657.getClass(), "lastRegionId", -859828739);
        setField(term7657, term7657.getClass(), "lastRegionName", "bnsyeQXFdu");
        setField(term7657, term7657.getClass(), "lastClientId", "BwtdjiefJn");
        setField(term7657, term7657.getClass(), "lastCountryCode", "jDmhBrIoDa");
        setIntField(term7657, term7657.getClass(), "eventPoint", 1986855642);
        setIntField(term7657, term7657.getClass(), "totalLv", 1280322790);
        setIntField(term7657, term7657.getClass(), "lastLoginBonusDay", -1702209203);
        setIntField(term7657, term7657.getClass(), "lastSurvivalBonusDay", -1592307668);
        setIntField(term7657, term7657.getClass(), "loginBonusLv", -203832871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term7657, args);
    }

};


