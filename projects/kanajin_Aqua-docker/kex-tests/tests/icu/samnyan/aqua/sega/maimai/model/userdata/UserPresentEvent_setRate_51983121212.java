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

public class UserPresentEvent_setRate_51983121212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100145;
     Object term100325;

    public UserPresentEvent_setRate_51983121212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100151 = new Long(468487103823886117L);
        term100145 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term100147 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term100149 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100180 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100145, term100145.getClass(), "id", 3627398214180261490L);
        setLongField(term100147, term100147.getClass(), "id", -8287703806860141511L);
        setLongField(term100149, term100149.getClass(), "id", 4190829300851698907L);
        setField(term100149, term100149.getClass(), "extId", term100151);
        setField(term100149, term100149.getClass(), "luid", "OeOnaLqxoy");
        setIntField(term100166, term100166.getClass(), "year", 2011);
        setShortField(term100166, term100166.getClass(), "month", (short) 4);
        setShortField(term100166, term100166.getClass(), "day", (short) 30);
        setField(term100165, term100165.getClass(), "date", term100166);
        setByteField(term100170, term100170.getClass(), "hour", (byte) 5);
        setByteField(term100170, term100170.getClass(), "minute", (byte) 2);
        setByteField(term100170, term100170.getClass(), "second", (byte) 59);
        setIntField(term100170, term100170.getClass(), "nano", 800923694);
        setField(term100165, term100165.getClass(), "time", term100170);
        setField(term100149, term100149.getClass(), "registerTime", term100165);
        setIntField(term100176, term100176.getClass(), "year", 2027);
        setShortField(term100176, term100176.getClass(), "month", (short) 5);
        setShortField(term100176, term100176.getClass(), "day", (short) 8);
        setField(term100175, term100175.getClass(), "date", term100176);
        setByteField(term100180, term100180.getClass(), "hour", (byte) 4);
        setByteField(term100180, term100180.getClass(), "minute", (byte) 0);
        setByteField(term100180, term100180.getClass(), "second", (byte) 19);
        setIntField(term100180, term100180.getClass(), "nano", 400713347);
        setField(term100175, term100175.getClass(), "time", term100180);
        setField(term100149, term100149.getClass(), "accessTime", term100175);
        setField(term100147, term100147.getClass(), "card", term100149);
        setIntField(term100147, term100147.getClass(), "lastDataVersion", -1344634590);
        setField(term100147, term100147.getClass(), "userName", "buRlIDjuAa");
        setIntField(term100147, term100147.getClass(), "point", 1517451081);
        setIntField(term100147, term100147.getClass(), "totalPoint", -1020317108);
        setIntField(term100147, term100147.getClass(), "iconId", 450923402);
        setIntField(term100147, term100147.getClass(), "nameplateId", -346441975);
        setIntField(term100147, term100147.getClass(), "frameId", -252504773);
        setIntField(term100147, term100147.getClass(), "trophyId", 1683059400);
        setIntField(term100147, term100147.getClass(), "playCount", 1519559286);
        setIntField(term100147, term100147.getClass(), "playVsCount", 1885237730);
        setIntField(term100147, term100147.getClass(), "playSyncCount", 261995675);
        setIntField(term100147, term100147.getClass(), "winCount", 1400945112);
        setIntField(term100147, term100147.getClass(), "helpCount", -1431100559);
        setIntField(term100147, term100147.getClass(), "comboCount", 2093909511);
        setIntField(term100147, term100147.getClass(), "feverCount", -1440780852);
        setIntField(term100147, term100147.getClass(), "totalHiScore", -256492547);
        setIntField(term100147, term100147.getClass(), "totalEasyHighScore", -1893302330);
        setIntField(term100147, term100147.getClass(), "totalBasicHighScore", 1177746134);
        setIntField(term100147, term100147.getClass(), "totalAdvancedHighScore", 1076828616);
        setIntField(term100147, term100147.getClass(), "totalExpertHighScore", -621733040);
        setIntField(term100147, term100147.getClass(), "totalMasterHighScore", -1031608080);
        setIntField(term100147, term100147.getClass(), "totalReMasterHighScore", -1516023185);
        setIntField(term100147, term100147.getClass(), "totalHighSync", -1813690212);
        setIntField(term100147, term100147.getClass(), "totalEasySync", 1577352938);
        setIntField(term100147, term100147.getClass(), "totalBasicSync", 1745100327);
        setIntField(term100147, term100147.getClass(), "totalAdvancedSync", 1136069052);
        setIntField(term100147, term100147.getClass(), "totalExpertSync", -733793514);
        setIntField(term100147, term100147.getClass(), "totalMasterSync", -1188742010);
        setIntField(term100147, term100147.getClass(), "totalReMasterSync", -143261890);
        setIntField(term100147, term100147.getClass(), "playerRating", -20933455);
        setIntField(term100147, term100147.getClass(), "highestRating", -1448787013);
        setIntField(term100147, term100147.getClass(), "rankAuthTailId", -998901659);
        setField(term100147, term100147.getClass(), "eventWatchedDate", "qDicwPaclz");
        setField(term100147, term100147.getClass(), "webLimitDate", "eZlPEKWGYm");
        setIntField(term100147, term100147.getClass(), "challengeTrackPhase", -1128990548);
        setIntField(term100147, term100147.getClass(), "firstPlayBits", -1878697260);
        setField(term100147, term100147.getClass(), "lastPlayDate", "KuunqhygWm");
        setIntField(term100147, term100147.getClass(), "lastPlaceId", 489173758);
        setField(term100147, term100147.getClass(), "lastPlaceName", "wKOfSnwiZS");
        setIntField(term100147, term100147.getClass(), "lastRegionId", 1717231473);
        setField(term100147, term100147.getClass(), "lastRegionName", "oIlPhWewqE");
        setField(term100147, term100147.getClass(), "lastClientId", "IfOJiWUkHp");
        setField(term100147, term100147.getClass(), "lastCountryCode", "YQNWnfnWil");
        setIntField(term100147, term100147.getClass(), "eventPoint", -692019993);
        setIntField(term100147, term100147.getClass(), "totalLv", 232421375);
        setIntField(term100147, term100147.getClass(), "lastLoginBonusDay", -2134429009);
        setIntField(term100147, term100147.getClass(), "lastSurvivalBonusDay", 709648293);
        setIntField(term100147, term100147.getClass(), "loginBonusLv", 1968045816);
        setField(term100145, term100145.getClass(), "user", term100147);
        setIntField(term100145, term100145.getClass(), "presentEventId", 2026259813);
        setIntField(term100145, term100145.getClass(), "point", 1869405361);
        setIntField(term100145, term100145.getClass(), "presentCount", -1535999317);
        setIntField(term100145, term100145.getClass(), "rate", -1668505013);
        term100325 = new Integer(-180162862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100325;
        callMethod(klass, "setRate", argTypes, term100145, args);
    }

};


