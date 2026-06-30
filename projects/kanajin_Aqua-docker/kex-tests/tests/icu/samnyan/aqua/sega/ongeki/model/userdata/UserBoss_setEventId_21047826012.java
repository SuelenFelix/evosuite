package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserBoss_setEventId_21047826012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139300;
     Object term139569;

    public UserBoss_setEventId_21047826012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139306 = new Long(1463379874413441830L);
        term139300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term139302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term139304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term139320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term139300, term139300.getClass(), "id", -926571219505623909L);
        setLongField(term139302, term139302.getClass(), "id", 4720708725577833050L);
        setLongField(term139304, term139304.getClass(), "id", -3565222130882328172L);
        setField(term139304, term139304.getClass(), "extId", term139306);
        setField(term139304, term139304.getClass(), "luid", "oENXVcVJUC");
        setIntField(term139321, term139321.getClass(), "year", 2019);
        setShortField(term139321, term139321.getClass(), "month", (short) 4);
        setShortField(term139321, term139321.getClass(), "day", (short) 22);
        setField(term139320, term139320.getClass(), "date", term139321);
        setByteField(term139325, term139325.getClass(), "hour", (byte) 11);
        setByteField(term139325, term139325.getClass(), "minute", (byte) 30);
        setByteField(term139325, term139325.getClass(), "second", (byte) 42);
        setIntField(term139325, term139325.getClass(), "nano", 733500025);
        setField(term139320, term139320.getClass(), "time", term139325);
        setField(term139304, term139304.getClass(), "registerTime", term139320);
        setIntField(term139331, term139331.getClass(), "year", 2028);
        setShortField(term139331, term139331.getClass(), "month", (short) 12);
        setShortField(term139331, term139331.getClass(), "day", (short) 13);
        setField(term139330, term139330.getClass(), "date", term139331);
        setByteField(term139335, term139335.getClass(), "hour", (byte) 1);
        setByteField(term139335, term139335.getClass(), "minute", (byte) 15);
        setByteField(term139335, term139335.getClass(), "second", (byte) 43);
        setIntField(term139335, term139335.getClass(), "nano", 678972290);
        setField(term139330, term139330.getClass(), "time", term139335);
        setField(term139304, term139304.getClass(), "accessTime", term139330);
        setField(term139302, term139302.getClass(), "card", term139304);
        setField(term139302, term139302.getClass(), "userName", "ytIVCXPyNV");
        setIntField(term139302, term139302.getClass(), "level", 414903799);
        setIntField(term139302, term139302.getClass(), "reincarnationNum", -119095068);
        setLongField(term139302, term139302.getClass(), "exp", 8512315473040189557L);
        setLongField(term139302, term139302.getClass(), "point", -790671160566745565L);
        setLongField(term139302, term139302.getClass(), "totalPoint", 7021756555250939478L);
        setIntField(term139302, term139302.getClass(), "playCount", -554797420);
        setIntField(term139302, term139302.getClass(), "jewelCount", 1064643540);
        setIntField(term139302, term139302.getClass(), "totalJewelCount", -1302908658);
        setIntField(term139302, term139302.getClass(), "medalCount", 1625710313);
        setIntField(term139302, term139302.getClass(), "playerRating", 1771251643);
        setIntField(term139302, term139302.getClass(), "highestRating", 1771106298);
        setIntField(term139302, term139302.getClass(), "battlePoint", 489428207);
        setIntField(term139302, term139302.getClass(), "bestBattlePoint", -1189670798);
        setIntField(term139302, term139302.getClass(), "overDamageBattlePoint", 1856659430);
        setBooleanField(term139302, term139302.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term139302, term139302.getClass(), "nameplateId", 1163865944);
        setIntField(term139302, term139302.getClass(), "trophyId", 791409574);
        setIntField(term139302, term139302.getClass(), "cardId", 1650362015);
        setIntField(term139302, term139302.getClass(), "characterId", 1500712275);
        setIntField(term139302, term139302.getClass(), "characterVoiceNo", 1770935991);
        setIntField(term139302, term139302.getClass(), "tabSetting", -1431015722);
        setIntField(term139302, term139302.getClass(), "tabSortSetting", 848351607);
        setIntField(term139302, term139302.getClass(), "cardCategorySetting", -273652793);
        setIntField(term139302, term139302.getClass(), "cardSortSetting", 765378004);
        setIntField(term139302, term139302.getClass(), "rivalScoreCategorySetting", 831719919);
        setIntField(term139302, term139302.getClass(), "playedTutorialBit", 1340129291);
        setIntField(term139302, term139302.getClass(), "firstTutorialCancelNum", -1877793816);
        setLongField(term139302, term139302.getClass(), "sumTechHighScore", 1676997889344871130L);
        setLongField(term139302, term139302.getClass(), "sumTechBasicHighScore", -2743255353903091630L);
        setLongField(term139302, term139302.getClass(), "sumTechAdvancedHighScore", -4679325610247389708L);
        setLongField(term139302, term139302.getClass(), "sumTechExpertHighScore", -6832334945471564781L);
        setLongField(term139302, term139302.getClass(), "sumTechMasterHighScore", -2657061659498648646L);
        setLongField(term139302, term139302.getClass(), "sumTechLunaticHighScore", 1037209784268843419L);
        setLongField(term139302, term139302.getClass(), "sumBattleHighScore", 5862983255265206567L);
        setLongField(term139302, term139302.getClass(), "sumBattleBasicHighScore", 8012523851342473352L);
        setLongField(term139302, term139302.getClass(), "sumBattleAdvancedHighScore", 4305433268503723214L);
        setLongField(term139302, term139302.getClass(), "sumBattleExpertHighScore", -2269088430002475623L);
        setLongField(term139302, term139302.getClass(), "sumBattleMasterHighScore", -3336153764223739397L);
        setLongField(term139302, term139302.getClass(), "sumBattleLunaticHighScore", -3013118304336010128L);
        setField(term139302, term139302.getClass(), "eventWatchedDate", "LmUSMvJtpQ");
        setField(term139302, term139302.getClass(), "cmEventWatchedDate", "eoDQvGDMGx");
        setField(term139302, term139302.getClass(), "firstGameId", "OtuSXazGGk");
        setField(term139302, term139302.getClass(), "firstRomVersion", "tBhjvegtdH");
        setField(term139302, term139302.getClass(), "firstDataVersion", "OpHteeKkID");
        setField(term139302, term139302.getClass(), "firstPlayDate", "EPqrGqPuGp");
        setField(term139302, term139302.getClass(), "lastGameId", "fevqUofURr");
        setField(term139302, term139302.getClass(), "lastRomVersion", "jvawePHFow");
        setField(term139302, term139302.getClass(), "lastDataVersion", "qUypQjDKks");
        setField(term139302, term139302.getClass(), "compatibleCmVersion", "VItjCXRpXX");
        setField(term139302, term139302.getClass(), "lastPlayDate", "CuQvkbeIKF");
        setIntField(term139302, term139302.getClass(), "lastPlaceId", 1815838239);
        setField(term139302, term139302.getClass(), "lastPlaceName", "JTDaVaJNVZ");
        setIntField(term139302, term139302.getClass(), "lastRegionId", -897797215);
        setField(term139302, term139302.getClass(), "lastRegionName", "SqbHVsvNsi");
        setIntField(term139302, term139302.getClass(), "lastAllNetId", -1187799333);
        setField(term139302, term139302.getClass(), "lastClientId", "PCctsmeLnX");
        setIntField(term139302, term139302.getClass(), "lastUsedDeckId", -1222671412);
        setIntField(term139302, term139302.getClass(), "lastPlayMusicLevel", 1753444798);
        setIntField(term139302, term139302.getClass(), "lastEmoneyBrand", -1511001461);
        setField(term139300, term139300.getClass(), "user", term139302);
        setIntField(term139300, term139300.getClass(), "musicId", -1668810633);
        setIntField(term139300, term139300.getClass(), "damage", -382694195);
        setBooleanField(term139300, term139300.getClass(), "isClear", false);
        setIntField(term139300, term139300.getClass(), "eventId", -818635049);
        term139569 = new Integer(2059446583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term139569;
        callMethod(klass, "setEventId", argTypes, term139300, args);
    }

};


