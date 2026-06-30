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

public class UserData_setPlayerRating_24219660781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21511;
     Object term21685;

    public UserData_setPlayerRating_24219660781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21515 = new Long(-1983291584002806658L);
        term21511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term21513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21544 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21511, term21511.getClass(), "id", -8121849829073967555L);
        setLongField(term21513, term21513.getClass(), "id", 5219030281405653303L);
        setField(term21513, term21513.getClass(), "extId", term21515);
        setField(term21513, term21513.getClass(), "luid", "FrTZLybkKk");
        setIntField(term21530, term21530.getClass(), "year", 2029);
        setShortField(term21530, term21530.getClass(), "month", (short) 11);
        setShortField(term21530, term21530.getClass(), "day", (short) 8);
        setField(term21529, term21529.getClass(), "date", term21530);
        setByteField(term21534, term21534.getClass(), "hour", (byte) 23);
        setByteField(term21534, term21534.getClass(), "minute", (byte) 43);
        setByteField(term21534, term21534.getClass(), "second", (byte) 12);
        setIntField(term21534, term21534.getClass(), "nano", 586227255);
        setField(term21529, term21529.getClass(), "time", term21534);
        setField(term21513, term21513.getClass(), "registerTime", term21529);
        setIntField(term21540, term21540.getClass(), "year", 2014);
        setShortField(term21540, term21540.getClass(), "month", (short) 1);
        setShortField(term21540, term21540.getClass(), "day", (short) 23);
        setField(term21539, term21539.getClass(), "date", term21540);
        setByteField(term21544, term21544.getClass(), "hour", (byte) 19);
        setByteField(term21544, term21544.getClass(), "minute", (byte) 52);
        setByteField(term21544, term21544.getClass(), "second", (byte) 9);
        setIntField(term21544, term21544.getClass(), "nano", 235326975);
        setField(term21539, term21539.getClass(), "time", term21544);
        setField(term21513, term21513.getClass(), "accessTime", term21539);
        setField(term21511, term21511.getClass(), "card", term21513);
        setIntField(term21511, term21511.getClass(), "lastDataVersion", -289675978);
        setField(term21511, term21511.getClass(), "userName", "FlxVmiMYKP");
        setIntField(term21511, term21511.getClass(), "point", 1466847406);
        setIntField(term21511, term21511.getClass(), "totalPoint", 1943280473);
        setIntField(term21511, term21511.getClass(), "iconId", 1068101842);
        setIntField(term21511, term21511.getClass(), "nameplateId", 1060522715);
        setIntField(term21511, term21511.getClass(), "frameId", -451590147);
        setIntField(term21511, term21511.getClass(), "trophyId", -537090894);
        setIntField(term21511, term21511.getClass(), "playCount", 105089682);
        setIntField(term21511, term21511.getClass(), "playVsCount", 1304790955);
        setIntField(term21511, term21511.getClass(), "playSyncCount", -1412824084);
        setIntField(term21511, term21511.getClass(), "winCount", 659034364);
        setIntField(term21511, term21511.getClass(), "helpCount", 671129726);
        setIntField(term21511, term21511.getClass(), "comboCount", -1217066846);
        setIntField(term21511, term21511.getClass(), "feverCount", 570145845);
        setIntField(term21511, term21511.getClass(), "totalHiScore", 1990162126);
        setIntField(term21511, term21511.getClass(), "totalEasyHighScore", 1728957652);
        setIntField(term21511, term21511.getClass(), "totalBasicHighScore", -482056965);
        setIntField(term21511, term21511.getClass(), "totalAdvancedHighScore", 1727638564);
        setIntField(term21511, term21511.getClass(), "totalExpertHighScore", 1102029917);
        setIntField(term21511, term21511.getClass(), "totalMasterHighScore", 506784803);
        setIntField(term21511, term21511.getClass(), "totalReMasterHighScore", -1201816382);
        setIntField(term21511, term21511.getClass(), "totalHighSync", 964841377);
        setIntField(term21511, term21511.getClass(), "totalEasySync", -1503153618);
        setIntField(term21511, term21511.getClass(), "totalBasicSync", -1417720854);
        setIntField(term21511, term21511.getClass(), "totalAdvancedSync", -231019352);
        setIntField(term21511, term21511.getClass(), "totalExpertSync", -677712787);
        setIntField(term21511, term21511.getClass(), "totalMasterSync", -473854701);
        setIntField(term21511, term21511.getClass(), "totalReMasterSync", -193355905);
        setIntField(term21511, term21511.getClass(), "playerRating", -104223978);
        setIntField(term21511, term21511.getClass(), "highestRating", 192932780);
        setIntField(term21511, term21511.getClass(), "rankAuthTailId", -902517932);
        setField(term21511, term21511.getClass(), "eventWatchedDate", "fgOpAWlGYN");
        setField(term21511, term21511.getClass(), "webLimitDate", "PNzNzzjSXM");
        setIntField(term21511, term21511.getClass(), "challengeTrackPhase", 2043141938);
        setIntField(term21511, term21511.getClass(), "firstPlayBits", 51110531);
        setField(term21511, term21511.getClass(), "lastPlayDate", "ktKcSZiuGM");
        setIntField(term21511, term21511.getClass(), "lastPlaceId", -142424158);
        setField(term21511, term21511.getClass(), "lastPlaceName", "PSOttyUeqv");
        setIntField(term21511, term21511.getClass(), "lastRegionId", 360866091);
        setField(term21511, term21511.getClass(), "lastRegionName", "HmEvTlmzXo");
        setField(term21511, term21511.getClass(), "lastClientId", "BMMonTIZgJ");
        setField(term21511, term21511.getClass(), "lastCountryCode", "QXyFXBjFde");
        setIntField(term21511, term21511.getClass(), "eventPoint", -1711966798);
        setIntField(term21511, term21511.getClass(), "totalLv", 414375178);
        setIntField(term21511, term21511.getClass(), "lastLoginBonusDay", -189623871);
        setIntField(term21511, term21511.getClass(), "lastSurvivalBonusDay", -1500608395);
        setIntField(term21511, term21511.getClass(), "loginBonusLv", -1957666898);
        term21685 = new Integer(-1073146570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21685;
        callMethod(klass, "setPlayerRating", argTypes, term21511, args);
    }

};


