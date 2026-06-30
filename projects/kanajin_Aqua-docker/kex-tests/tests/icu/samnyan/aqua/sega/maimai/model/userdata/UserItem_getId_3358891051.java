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

public class UserItem_getId_3358891051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84559;

    public UserItem_getId_3358891051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84565 = new Long(7271112616766426991L);
        term84559 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term84561 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term84563 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84594 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84559, term84559.getClass(), "id", 8912657350087595530L);
        setLongField(term84561, term84561.getClass(), "id", 7440648013789140935L);
        setLongField(term84563, term84563.getClass(), "id", -7488291606536854368L);
        setField(term84563, term84563.getClass(), "extId", term84565);
        setField(term84563, term84563.getClass(), "luid", "PxinRhWgwT");
        setIntField(term84580, term84580.getClass(), "year", 2018);
        setShortField(term84580, term84580.getClass(), "month", (short) 2);
        setShortField(term84580, term84580.getClass(), "day", (short) 15);
        setField(term84579, term84579.getClass(), "date", term84580);
        setByteField(term84584, term84584.getClass(), "hour", (byte) 16);
        setByteField(term84584, term84584.getClass(), "minute", (byte) 4);
        setByteField(term84584, term84584.getClass(), "second", (byte) 19);
        setIntField(term84584, term84584.getClass(), "nano", 538124451);
        setField(term84579, term84579.getClass(), "time", term84584);
        setField(term84563, term84563.getClass(), "registerTime", term84579);
        setIntField(term84590, term84590.getClass(), "year", 2013);
        setShortField(term84590, term84590.getClass(), "month", (short) 10);
        setShortField(term84590, term84590.getClass(), "day", (short) 20);
        setField(term84589, term84589.getClass(), "date", term84590);
        setByteField(term84594, term84594.getClass(), "hour", (byte) 11);
        setByteField(term84594, term84594.getClass(), "minute", (byte) 17);
        setByteField(term84594, term84594.getClass(), "second", (byte) 1);
        setIntField(term84594, term84594.getClass(), "nano", 266879040);
        setField(term84589, term84589.getClass(), "time", term84594);
        setField(term84563, term84563.getClass(), "accessTime", term84589);
        setField(term84561, term84561.getClass(), "card", term84563);
        setIntField(term84561, term84561.getClass(), "lastDataVersion", -1147691858);
        setField(term84561, term84561.getClass(), "userName", "pZcEKUNIXL");
        setIntField(term84561, term84561.getClass(), "point", 616616334);
        setIntField(term84561, term84561.getClass(), "totalPoint", -1969160621);
        setIntField(term84561, term84561.getClass(), "iconId", -559288485);
        setIntField(term84561, term84561.getClass(), "nameplateId", 580044418);
        setIntField(term84561, term84561.getClass(), "frameId", 201009830);
        setIntField(term84561, term84561.getClass(), "trophyId", -968129874);
        setIntField(term84561, term84561.getClass(), "playCount", 210247336);
        setIntField(term84561, term84561.getClass(), "playVsCount", 108061876);
        setIntField(term84561, term84561.getClass(), "playSyncCount", 2146109676);
        setIntField(term84561, term84561.getClass(), "winCount", -921816721);
        setIntField(term84561, term84561.getClass(), "helpCount", 11766966);
        setIntField(term84561, term84561.getClass(), "comboCount", -2087888307);
        setIntField(term84561, term84561.getClass(), "feverCount", -999111284);
        setIntField(term84561, term84561.getClass(), "totalHiScore", 1282305528);
        setIntField(term84561, term84561.getClass(), "totalEasyHighScore", -1610344384);
        setIntField(term84561, term84561.getClass(), "totalBasicHighScore", -1571340466);
        setIntField(term84561, term84561.getClass(), "totalAdvancedHighScore", 1334936625);
        setIntField(term84561, term84561.getClass(), "totalExpertHighScore", 709928760);
        setIntField(term84561, term84561.getClass(), "totalMasterHighScore", 1608610468);
        setIntField(term84561, term84561.getClass(), "totalReMasterHighScore", 245689640);
        setIntField(term84561, term84561.getClass(), "totalHighSync", -82429857);
        setIntField(term84561, term84561.getClass(), "totalEasySync", 221870912);
        setIntField(term84561, term84561.getClass(), "totalBasicSync", -60408343);
        setIntField(term84561, term84561.getClass(), "totalAdvancedSync", 1431264881);
        setIntField(term84561, term84561.getClass(), "totalExpertSync", 699604256);
        setIntField(term84561, term84561.getClass(), "totalMasterSync", 977600534);
        setIntField(term84561, term84561.getClass(), "totalReMasterSync", -1651996925);
        setIntField(term84561, term84561.getClass(), "playerRating", -1023978027);
        setIntField(term84561, term84561.getClass(), "highestRating", 1121878754);
        setIntField(term84561, term84561.getClass(), "rankAuthTailId", -821475895);
        setField(term84561, term84561.getClass(), "eventWatchedDate", "QbRtvZIDtW");
        setField(term84561, term84561.getClass(), "webLimitDate", "fbsmDvjMqr");
        setIntField(term84561, term84561.getClass(), "challengeTrackPhase", -203874219);
        setIntField(term84561, term84561.getClass(), "firstPlayBits", 1988198474);
        setField(term84561, term84561.getClass(), "lastPlayDate", "tycssGWZvU");
        setIntField(term84561, term84561.getClass(), "lastPlaceId", -1202186337);
        setField(term84561, term84561.getClass(), "lastPlaceName", "jcvrILwbgt");
        setIntField(term84561, term84561.getClass(), "lastRegionId", -1823054395);
        setField(term84561, term84561.getClass(), "lastRegionName", "AphrAHzPMC");
        setField(term84561, term84561.getClass(), "lastClientId", "iwismCnYjB");
        setField(term84561, term84561.getClass(), "lastCountryCode", "GerBZdiruT");
        setIntField(term84561, term84561.getClass(), "eventPoint", 243245174);
        setIntField(term84561, term84561.getClass(), "totalLv", -1191836025);
        setIntField(term84561, term84561.getClass(), "lastLoginBonusDay", -67629762);
        setIntField(term84561, term84561.getClass(), "lastSurvivalBonusDay", -619203736);
        setIntField(term84561, term84561.getClass(), "loginBonusLv", -97449673);
        setField(term84559, term84559.getClass(), "user", term84561);
        setIntField(term84559, term84559.getClass(), "itemKind", -1237106250);
        setIntField(term84559, term84559.getClass(), "itemId", -958414279);
        setIntField(term84559, term84559.getClass(), "stock", 1019142612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term84559, args);
    }

};


