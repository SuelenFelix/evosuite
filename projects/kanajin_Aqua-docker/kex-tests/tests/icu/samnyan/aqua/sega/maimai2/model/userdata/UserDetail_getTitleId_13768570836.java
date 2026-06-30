package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getTitleId_13768570836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198966;

    public UserDetail_getTitleId_13768570836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term198970 = new Long(6150186973473930616L);
        Integer term199033 = new Integer(805310057);
        ArrayList term199031 = new ArrayList();
        ((ArrayList) term199031).add(term199033);
        Integer term199039 = new Integer(-107339699);
        Integer term199041 = new Integer(-58728001);
        Integer term199043 = new Integer(1013952192);
        Integer term199045 = new Integer(-986675483);
        Integer term199047 = new Integer(337370099);
        Integer term199049 = new Integer(-824145581);
        Integer term199051 = new Integer(-769314399);
        ArrayList term199037 = new ArrayList();
        ((ArrayList) term199037).add(term199039);
        ((ArrayList) term199037).add(term199041);
        ((ArrayList) term199037).add(term199043);
        ((ArrayList) term199037).add(term199045);
        ((ArrayList) term199037).add(term199047);
        ((ArrayList) term199037).add(term199049);
        ((ArrayList) term199037).add(term199051);
        term198966 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term198968 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term198984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term198994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198999 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term198966, term198966.getClass(), "id", -2032737721665991212L);
        setLongField(term198968, term198968.getClass(), "id", 6861285564186139862L);
        setField(term198968, term198968.getClass(), "extId", term198970);
        setField(term198968, term198968.getClass(), "luid", "bDNxauNLik");
        setIntField(term198985, term198985.getClass(), "year", 2029);
        setShortField(term198985, term198985.getClass(), "month", (short) 8);
        setShortField(term198985, term198985.getClass(), "day", (short) 22);
        setField(term198984, term198984.getClass(), "date", term198985);
        setByteField(term198989, term198989.getClass(), "hour", (byte) 10);
        setByteField(term198989, term198989.getClass(), "minute", (byte) 22);
        setByteField(term198989, term198989.getClass(), "second", (byte) 10);
        setIntField(term198989, term198989.getClass(), "nano", 996890551);
        setField(term198984, term198984.getClass(), "time", term198989);
        setField(term198968, term198968.getClass(), "registerTime", term198984);
        setIntField(term198995, term198995.getClass(), "year", 2021);
        setShortField(term198995, term198995.getClass(), "month", (short) 7);
        setShortField(term198995, term198995.getClass(), "day", (short) 26);
        setField(term198994, term198994.getClass(), "date", term198995);
        setByteField(term198999, term198999.getClass(), "hour", (byte) 16);
        setByteField(term198999, term198999.getClass(), "minute", (byte) 31);
        setByteField(term198999, term198999.getClass(), "second", (byte) 41);
        setIntField(term198999, term198999.getClass(), "nano", 114150112);
        setField(term198994, term198994.getClass(), "time", term198999);
        setField(term198968, term198968.getClass(), "accessTime", term198994);
        setField(term198966, term198966.getClass(), "card", term198968);
        setField(term198966, term198966.getClass(), "userName", "zllSGZNekr");
        setIntField(term198966, term198966.getClass(), "isNetMember", -975694837);
        setIntField(term198966, term198966.getClass(), "iconId", 600354879);
        setIntField(term198966, term198966.getClass(), "plateId", -1910867502);
        setIntField(term198966, term198966.getClass(), "titleId", -681154934);
        setIntField(term198966, term198966.getClass(), "partnerId", -1605929703);
        setIntField(term198966, term198966.getClass(), "frameId", -299263678);
        setIntField(term198966, term198966.getClass(), "selectMapId", 347664273);
        setIntField(term198966, term198966.getClass(), "totalAwake", 1180386145);
        setIntField(term198966, term198966.getClass(), "gradeRating", -1226044289);
        setIntField(term198966, term198966.getClass(), "musicRating", 803651464);
        setIntField(term198966, term198966.getClass(), "playerRating", -1466570615);
        setIntField(term198966, term198966.getClass(), "highestRating", -471545371);
        setIntField(term198966, term198966.getClass(), "gradeRank", -505396503);
        setIntField(term198966, term198966.getClass(), "classRank", 1161692766);
        setIntField(term198966, term198966.getClass(), "courseRank", -1367168675);
        setField(term198966, term198966.getClass(), "charaSlot", term199031);
        setField(term198966, term198966.getClass(), "charaLockSlot", term199037);
        setLongField(term198966, term198966.getClass(), "contentBit", -3094749699593978168L);
        setIntField(term198966, term198966.getClass(), "playCount", 1207815248);
        setField(term198966, term198966.getClass(), "eventWatchedDate", "JWOwmhoHts");
        setField(term198966, term198966.getClass(), "lastGameId", "bzOvtPlmVY");
        setField(term198966, term198966.getClass(), "lastRomVersion", "MQMSJRAmmg");
        setField(term198966, term198966.getClass(), "lastDataVersion", "vTdDItJvmi");
        setField(term198966, term198966.getClass(), "lastLoginDate", "DluiSfcOlN");
        setField(term198966, term198966.getClass(), "lastPlayDate", "RQlsJKSdYb");
        setIntField(term198966, term198966.getClass(), "lastPlayCredit", -574020974);
        setIntField(term198966, term198966.getClass(), "lastPlayMode", 1971932785);
        setIntField(term198966, term198966.getClass(), "lastPlaceId", 2069110501);
        setField(term198966, term198966.getClass(), "lastPlaceName", "cDXMKVYcib");
        setIntField(term198966, term198966.getClass(), "lastAllNetId", 620342422);
        setIntField(term198966, term198966.getClass(), "lastRegionId", -839533151);
        setField(term198966, term198966.getClass(), "lastRegionName", "KXEooulOVY");
        setField(term198966, term198966.getClass(), "lastClientId", "aADbloZhVB");
        setField(term198966, term198966.getClass(), "lastCountryCode", "VINeGBjdzo");
        setIntField(term198966, term198966.getClass(), "lastSelectEMoney", -1395988897);
        setIntField(term198966, term198966.getClass(), "lastSelectTicket", -1572616912);
        setIntField(term198966, term198966.getClass(), "lastSelectCourse", 637817122);
        setIntField(term198966, term198966.getClass(), "lastCountCourse", -1666967856);
        setField(term198966, term198966.getClass(), "firstGameId", "jMnWqOiNiI");
        setField(term198966, term198966.getClass(), "firstRomVersion", "RNbaZoNAYf");
        setField(term198966, term198966.getClass(), "firstDataVersion", "lypBSjTSaf");
        setField(term198966, term198966.getClass(), "firstPlayDate", "eQyMmubvkd");
        setField(term198966, term198966.getClass(), "compatibleCmVersion", "FpXHFMsYMt");
        setField(term198966, term198966.getClass(), "dailyBonusDate", "vhIDepQdbX");
        setField(term198966, term198966.getClass(), "dailyCourseBonusDate", "AizJhCCKXG");
        setField(term198966, term198966.getClass(), "lastPairLoginDate", "iLylbwIxgL");
        setField(term198966, term198966.getClass(), "lastTrialPlayDate", "GdxqsdOdeY");
        setIntField(term198966, term198966.getClass(), "playVsCount", 288878731);
        setIntField(term198966, term198966.getClass(), "playSyncCount", -1345750324);
        setIntField(term198966, term198966.getClass(), "winCount", -329240379);
        setIntField(term198966, term198966.getClass(), "helpCount", 706310223);
        setIntField(term198966, term198966.getClass(), "comboCount", 1503842864);
        setLongField(term198966, term198966.getClass(), "totalDeluxscore", 4911838016842299479L);
        setLongField(term198966, term198966.getClass(), "totalBasicDeluxscore", 2600758108305337038L);
        setLongField(term198966, term198966.getClass(), "totalAdvancedDeluxscore", -5607146584686916044L);
        setLongField(term198966, term198966.getClass(), "totalExpertDeluxscore", -8618661675368845775L);
        setLongField(term198966, term198966.getClass(), "totalMasterDeluxscore", -6321289617766826299L);
        setLongField(term198966, term198966.getClass(), "totalReMasterDeluxscore", -7179960800513030576L);
        setIntField(term198966, term198966.getClass(), "totalSync", 1395180612);
        setIntField(term198966, term198966.getClass(), "totalBasicSync", 1625598443);
        setIntField(term198966, term198966.getClass(), "totalAdvancedSync", -38394649);
        setIntField(term198966, term198966.getClass(), "totalExpertSync", 1832189880);
        setIntField(term198966, term198966.getClass(), "totalMasterSync", -2087697431);
        setIntField(term198966, term198966.getClass(), "totalReMasterSync", 682498319);
        setLongField(term198966, term198966.getClass(), "totalAchievement", -7672585496330101619L);
        setLongField(term198966, term198966.getClass(), "totalBasicAchievement", 5916186589944818269L);
        setLongField(term198966, term198966.getClass(), "totalAdvancedAchievement", -8277612990946001763L);
        setLongField(term198966, term198966.getClass(), "totalExpertAchievement", 5997593072795724897L);
        setLongField(term198966, term198966.getClass(), "totalMasterAchievement", 8596222194900412730L);
        setLongField(term198966, term198966.getClass(), "totalReMasterAchievement", 2886701952614491778L);
        setLongField(term198966, term198966.getClass(), "playerOldRating", 5991101022744926909L);
        setLongField(term198966, term198966.getClass(), "playerNewRating", -2448299584042846072L);
        setIntField(term198966, term198966.getClass(), "banState", 1946906465);
        setLongField(term198966, term198966.getClass(), "dateTime", 1278060485580511930L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitleId", argTypes, term198966, args);
    }

};


