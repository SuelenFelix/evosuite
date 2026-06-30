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

public class UserCharacter_setCostumeId_157555458015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174961;
     Object term175246;

    public UserCharacter_setCostumeId_157555458015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term174967 = new Long(-8306611953768020559L);
        term174961 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term174963 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term174965 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term174981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term174982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term174986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term174991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term174992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term174996 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term174961, term174961.getClass(), "id", -8163869003949252164L);
        setLongField(term174963, term174963.getClass(), "id", -607756206767958766L);
        setLongField(term174965, term174965.getClass(), "id", -5601362953809626317L);
        setField(term174965, term174965.getClass(), "extId", term174967);
        setField(term174965, term174965.getClass(), "luid", "fdbVEWBAEN");
        setIntField(term174982, term174982.getClass(), "year", 2027);
        setShortField(term174982, term174982.getClass(), "month", (short) 2);
        setShortField(term174982, term174982.getClass(), "day", (short) 11);
        setField(term174981, term174981.getClass(), "date", term174982);
        setByteField(term174986, term174986.getClass(), "hour", (byte) 8);
        setByteField(term174986, term174986.getClass(), "minute", (byte) 5);
        setByteField(term174986, term174986.getClass(), "second", (byte) 22);
        setIntField(term174986, term174986.getClass(), "nano", 32017661);
        setField(term174981, term174981.getClass(), "time", term174986);
        setField(term174965, term174965.getClass(), "registerTime", term174981);
        setIntField(term174992, term174992.getClass(), "year", 2025);
        setShortField(term174992, term174992.getClass(), "month", (short) 9);
        setShortField(term174992, term174992.getClass(), "day", (short) 24);
        setField(term174991, term174991.getClass(), "date", term174992);
        setByteField(term174996, term174996.getClass(), "hour", (byte) 4);
        setByteField(term174996, term174996.getClass(), "minute", (byte) 49);
        setByteField(term174996, term174996.getClass(), "second", (byte) 51);
        setIntField(term174996, term174996.getClass(), "nano", 103885357);
        setField(term174991, term174991.getClass(), "time", term174996);
        setField(term174965, term174965.getClass(), "accessTime", term174991);
        setField(term174963, term174963.getClass(), "card", term174965);
        setField(term174963, term174963.getClass(), "userName", "FDVpQPnYQq");
        setIntField(term174963, term174963.getClass(), "level", -47039314);
        setIntField(term174963, term174963.getClass(), "reincarnationNum", 1242263247);
        setLongField(term174963, term174963.getClass(), "exp", -2963343028627970926L);
        setLongField(term174963, term174963.getClass(), "point", -3475893980837884356L);
        setLongField(term174963, term174963.getClass(), "totalPoint", -1973428419727299624L);
        setIntField(term174963, term174963.getClass(), "playCount", -313667953);
        setIntField(term174963, term174963.getClass(), "jewelCount", -2001885943);
        setIntField(term174963, term174963.getClass(), "totalJewelCount", -1140069411);
        setIntField(term174963, term174963.getClass(), "medalCount", -540827425);
        setIntField(term174963, term174963.getClass(), "playerRating", -1632149194);
        setIntField(term174963, term174963.getClass(), "highestRating", -741353227);
        setIntField(term174963, term174963.getClass(), "battlePoint", -1211689558);
        setIntField(term174963, term174963.getClass(), "bestBattlePoint", 318737566);
        setIntField(term174963, term174963.getClass(), "overDamageBattlePoint", -106759249);
        setBooleanField(term174963, term174963.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term174963, term174963.getClass(), "nameplateId", -1013531363);
        setIntField(term174963, term174963.getClass(), "trophyId", 1995440429);
        setIntField(term174963, term174963.getClass(), "cardId", -2048810677);
        setIntField(term174963, term174963.getClass(), "characterId", 1754415460);
        setIntField(term174963, term174963.getClass(), "characterVoiceNo", 2123228484);
        setIntField(term174963, term174963.getClass(), "tabSetting", 2086821771);
        setIntField(term174963, term174963.getClass(), "tabSortSetting", 1148090074);
        setIntField(term174963, term174963.getClass(), "cardCategorySetting", 1314246472);
        setIntField(term174963, term174963.getClass(), "cardSortSetting", -1940733744);
        setIntField(term174963, term174963.getClass(), "rivalScoreCategorySetting", 813004922);
        setIntField(term174963, term174963.getClass(), "playedTutorialBit", 1040865837);
        setIntField(term174963, term174963.getClass(), "firstTutorialCancelNum", -462903820);
        setLongField(term174963, term174963.getClass(), "sumTechHighScore", 4843893817805462778L);
        setLongField(term174963, term174963.getClass(), "sumTechBasicHighScore", 4337215445562937521L);
        setLongField(term174963, term174963.getClass(), "sumTechAdvancedHighScore", -7398757265676461965L);
        setLongField(term174963, term174963.getClass(), "sumTechExpertHighScore", -7596354887491898409L);
        setLongField(term174963, term174963.getClass(), "sumTechMasterHighScore", 3007092175291433144L);
        setLongField(term174963, term174963.getClass(), "sumTechLunaticHighScore", 8977127578670073786L);
        setLongField(term174963, term174963.getClass(), "sumBattleHighScore", 4916750179173147465L);
        setLongField(term174963, term174963.getClass(), "sumBattleBasicHighScore", 29705543197921155L);
        setLongField(term174963, term174963.getClass(), "sumBattleAdvancedHighScore", 5948824767935044534L);
        setLongField(term174963, term174963.getClass(), "sumBattleExpertHighScore", 6498754760108919381L);
        setLongField(term174963, term174963.getClass(), "sumBattleMasterHighScore", 5490377288658647689L);
        setLongField(term174963, term174963.getClass(), "sumBattleLunaticHighScore", -7225879757464875307L);
        setField(term174963, term174963.getClass(), "eventWatchedDate", "LxfTRMmGto");
        setField(term174963, term174963.getClass(), "cmEventWatchedDate", "HuJkboXrCO");
        setField(term174963, term174963.getClass(), "firstGameId", "RJAyzmKzwh");
        setField(term174963, term174963.getClass(), "firstRomVersion", "iNCbdkYTDl");
        setField(term174963, term174963.getClass(), "firstDataVersion", "SiUnHhtIma");
        setField(term174963, term174963.getClass(), "firstPlayDate", "NsYgklKfzx");
        setField(term174963, term174963.getClass(), "lastGameId", "pHObueqsTM");
        setField(term174963, term174963.getClass(), "lastRomVersion", "SuIvJHXNjM");
        setField(term174963, term174963.getClass(), "lastDataVersion", "VuWKhMTuCU");
        setField(term174963, term174963.getClass(), "compatibleCmVersion", "yQMOLysaDu");
        setField(term174963, term174963.getClass(), "lastPlayDate", "LfzDNXLOPk");
        setIntField(term174963, term174963.getClass(), "lastPlaceId", -1257429974);
        setField(term174963, term174963.getClass(), "lastPlaceName", "QwuwAVnPfr");
        setIntField(term174963, term174963.getClass(), "lastRegionId", -1004528891);
        setField(term174963, term174963.getClass(), "lastRegionName", "iGIJSOVbLk");
        setIntField(term174963, term174963.getClass(), "lastAllNetId", 851896454);
        setField(term174963, term174963.getClass(), "lastClientId", "MfGUuaFsKh");
        setIntField(term174963, term174963.getClass(), "lastUsedDeckId", -443182574);
        setIntField(term174963, term174963.getClass(), "lastPlayMusicLevel", 970363720);
        setIntField(term174963, term174963.getClass(), "lastEmoneyBrand", 442783372);
        setField(term174961, term174961.getClass(), "user", term174963);
        setIntField(term174961, term174961.getClass(), "characterId", -433426890);
        setIntField(term174961, term174961.getClass(), "costumeId", -1310705922);
        setIntField(term174961, term174961.getClass(), "attachmentId", -2051858041);
        setIntField(term174961, term174961.getClass(), "playCount", -355516401);
        setIntField(term174961, term174961.getClass(), "intimateLevel", 1837235354);
        setIntField(term174961, term174961.getClass(), "intimateCount", 1008836521);
        setIntField(term174961, term174961.getClass(), "intimateCountRewarded", 1301805757);
        setField(term174961, term174961.getClass(), "intimateCountDate", "kFUIISIsgC");
        setBooleanField(term174961, term174961.getClass(), "isNew", false);
        term175246 = new Integer(-103200853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term175246;
        callMethod(klass, "setCostumeId", argTypes, term174961, args);
    }

};


