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

public class UserTechEvent_setId_17070412919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355186;
     Object term355468;

    public UserTechEvent_setId_17070412919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term355192 = new Long(1370021222113276207L);
        term355186 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term355188 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term355190 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term355206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term355207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term355211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term355216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term355217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term355221 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term355186, term355186.getClass(), "id", -1387897080957748266L);
        setLongField(term355188, term355188.getClass(), "id", -2631244018091630947L);
        setLongField(term355190, term355190.getClass(), "id", 2682347664812479224L);
        setField(term355190, term355190.getClass(), "extId", term355192);
        setField(term355190, term355190.getClass(), "luid", "sXAfYKXUJT");
        setIntField(term355207, term355207.getClass(), "year", 2029);
        setShortField(term355207, term355207.getClass(), "month", (short) 3);
        setShortField(term355207, term355207.getClass(), "day", (short) 25);
        setField(term355206, term355206.getClass(), "date", term355207);
        setByteField(term355211, term355211.getClass(), "hour", (byte) 21);
        setByteField(term355211, term355211.getClass(), "minute", (byte) 56);
        setByteField(term355211, term355211.getClass(), "second", (byte) 22);
        setIntField(term355211, term355211.getClass(), "nano", 798354362);
        setField(term355206, term355206.getClass(), "time", term355211);
        setField(term355190, term355190.getClass(), "registerTime", term355206);
        setIntField(term355217, term355217.getClass(), "year", 2027);
        setShortField(term355217, term355217.getClass(), "month", (short) 4);
        setShortField(term355217, term355217.getClass(), "day", (short) 23);
        setField(term355216, term355216.getClass(), "date", term355217);
        setByteField(term355221, term355221.getClass(), "hour", (byte) 6);
        setByteField(term355221, term355221.getClass(), "minute", (byte) 31);
        setByteField(term355221, term355221.getClass(), "second", (byte) 47);
        setIntField(term355221, term355221.getClass(), "nano", 88987158);
        setField(term355216, term355216.getClass(), "time", term355221);
        setField(term355190, term355190.getClass(), "accessTime", term355216);
        setField(term355188, term355188.getClass(), "card", term355190);
        setField(term355188, term355188.getClass(), "userName", "EGeDpxBKUC");
        setIntField(term355188, term355188.getClass(), "level", -1575115809);
        setIntField(term355188, term355188.getClass(), "reincarnationNum", -1048109902);
        setLongField(term355188, term355188.getClass(), "exp", 8458996940255071650L);
        setLongField(term355188, term355188.getClass(), "point", 4023100181190027691L);
        setLongField(term355188, term355188.getClass(), "totalPoint", -9123057395974452928L);
        setIntField(term355188, term355188.getClass(), "playCount", 400044497);
        setIntField(term355188, term355188.getClass(), "jewelCount", -1032732364);
        setIntField(term355188, term355188.getClass(), "totalJewelCount", -772901170);
        setIntField(term355188, term355188.getClass(), "medalCount", 1010920323);
        setIntField(term355188, term355188.getClass(), "playerRating", 795109394);
        setIntField(term355188, term355188.getClass(), "highestRating", -1603426004);
        setIntField(term355188, term355188.getClass(), "battlePoint", 2129743945);
        setIntField(term355188, term355188.getClass(), "bestBattlePoint", 1226684652);
        setIntField(term355188, term355188.getClass(), "overDamageBattlePoint", 1760988562);
        setBooleanField(term355188, term355188.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term355188, term355188.getClass(), "nameplateId", -1651775743);
        setIntField(term355188, term355188.getClass(), "trophyId", -396665766);
        setIntField(term355188, term355188.getClass(), "cardId", -722629821);
        setIntField(term355188, term355188.getClass(), "characterId", -633621373);
        setIntField(term355188, term355188.getClass(), "characterVoiceNo", -1124899234);
        setIntField(term355188, term355188.getClass(), "tabSetting", -666861446);
        setIntField(term355188, term355188.getClass(), "tabSortSetting", 1499451545);
        setIntField(term355188, term355188.getClass(), "cardCategorySetting", 2119246378);
        setIntField(term355188, term355188.getClass(), "cardSortSetting", 1721762833);
        setIntField(term355188, term355188.getClass(), "rivalScoreCategorySetting", -95395858);
        setIntField(term355188, term355188.getClass(), "playedTutorialBit", 1637717331);
        setIntField(term355188, term355188.getClass(), "firstTutorialCancelNum", 553059303);
        setLongField(term355188, term355188.getClass(), "sumTechHighScore", 822833549240070923L);
        setLongField(term355188, term355188.getClass(), "sumTechBasicHighScore", 6854270473187881221L);
        setLongField(term355188, term355188.getClass(), "sumTechAdvancedHighScore", 2660419978791109613L);
        setLongField(term355188, term355188.getClass(), "sumTechExpertHighScore", -581616258801625404L);
        setLongField(term355188, term355188.getClass(), "sumTechMasterHighScore", 7246091721696808959L);
        setLongField(term355188, term355188.getClass(), "sumTechLunaticHighScore", 5114838335463815760L);
        setLongField(term355188, term355188.getClass(), "sumBattleHighScore", 3773327003360646445L);
        setLongField(term355188, term355188.getClass(), "sumBattleBasicHighScore", 1437510292190428550L);
        setLongField(term355188, term355188.getClass(), "sumBattleAdvancedHighScore", 7964170882808109382L);
        setLongField(term355188, term355188.getClass(), "sumBattleExpertHighScore", -6535070164011559792L);
        setLongField(term355188, term355188.getClass(), "sumBattleMasterHighScore", 6156945837648223711L);
        setLongField(term355188, term355188.getClass(), "sumBattleLunaticHighScore", -8739854605122341272L);
        setField(term355188, term355188.getClass(), "eventWatchedDate", "FoMgnDjZDl");
        setField(term355188, term355188.getClass(), "cmEventWatchedDate", "wkuoxTlSmF");
        setField(term355188, term355188.getClass(), "firstGameId", "pRvFtnBvXu");
        setField(term355188, term355188.getClass(), "firstRomVersion", "NlrLiTSjlE");
        setField(term355188, term355188.getClass(), "firstDataVersion", "ZlGYVrWngI");
        setField(term355188, term355188.getClass(), "firstPlayDate", "PXDUpSxiRX");
        setField(term355188, term355188.getClass(), "lastGameId", "boHrlxhREr");
        setField(term355188, term355188.getClass(), "lastRomVersion", "avCglJoqfH");
        setField(term355188, term355188.getClass(), "lastDataVersion", "qEkKeFPUnU");
        setField(term355188, term355188.getClass(), "compatibleCmVersion", "MxtpAzEvRW");
        setField(term355188, term355188.getClass(), "lastPlayDate", "xnflcVSNvi");
        setIntField(term355188, term355188.getClass(), "lastPlaceId", 1917532344);
        setField(term355188, term355188.getClass(), "lastPlaceName", "dDvlIqCsfH");
        setIntField(term355188, term355188.getClass(), "lastRegionId", 3457645);
        setField(term355188, term355188.getClass(), "lastRegionName", "ackdKeUhLg");
        setIntField(term355188, term355188.getClass(), "lastAllNetId", -1377628168);
        setField(term355188, term355188.getClass(), "lastClientId", "tWtKvasuFF");
        setIntField(term355188, term355188.getClass(), "lastUsedDeckId", -959778702);
        setIntField(term355188, term355188.getClass(), "lastPlayMusicLevel", 992492220);
        setIntField(term355188, term355188.getClass(), "lastEmoneyBrand", -199409402);
        setField(term355186, term355186.getClass(), "user", term355188);
        setIntField(term355186, term355186.getClass(), "eventId", -260237749);
        setIntField(term355186, term355186.getClass(), "totalTechScore", 584235366);
        setIntField(term355186, term355186.getClass(), "totalPlatinumScore", 32230270);
        setField(term355186, term355186.getClass(), "techRecordDate", "SsboWMnvAm");
        setBooleanField(term355186, term355186.getClass(), "isRankingRewarded", true);
        setBooleanField(term355186, term355186.getClass(), "isTotalTechNewRecord", true);
        term355468 = new Long(-6849859655818924425L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term355468;
        callMethod(klass, "setId", argTypes, term355186, args);
    }

};


