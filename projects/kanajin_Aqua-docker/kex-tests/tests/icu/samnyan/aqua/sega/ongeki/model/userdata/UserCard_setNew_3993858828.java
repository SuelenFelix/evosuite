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
import java.lang.Boolean;

public class UserCard_setNew_3993858828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126940;
     Object term127285;

    public UserCard_setNew_3993858828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126946 = new Long(-6685235643232255177L);
        term126940 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term126942 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term126944 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126975 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126940, term126940.getClass(), "id", 1198814678767080117L);
        setLongField(term126942, term126942.getClass(), "id", -7624374620883725110L);
        setLongField(term126944, term126944.getClass(), "id", -900020756466065789L);
        setField(term126944, term126944.getClass(), "extId", term126946);
        setField(term126944, term126944.getClass(), "luid", "DFKfoJgHLx");
        setIntField(term126961, term126961.getClass(), "year", 2019);
        setShortField(term126961, term126961.getClass(), "month", (short) 10);
        setShortField(term126961, term126961.getClass(), "day", (short) 4);
        setField(term126960, term126960.getClass(), "date", term126961);
        setByteField(term126965, term126965.getClass(), "hour", (byte) 14);
        setByteField(term126965, term126965.getClass(), "minute", (byte) 11);
        setByteField(term126965, term126965.getClass(), "second", (byte) 28);
        setIntField(term126965, term126965.getClass(), "nano", 963604727);
        setField(term126960, term126960.getClass(), "time", term126965);
        setField(term126944, term126944.getClass(), "registerTime", term126960);
        setIntField(term126971, term126971.getClass(), "year", 2029);
        setShortField(term126971, term126971.getClass(), "month", (short) 8);
        setShortField(term126971, term126971.getClass(), "day", (short) 18);
        setField(term126970, term126970.getClass(), "date", term126971);
        setByteField(term126975, term126975.getClass(), "hour", (byte) 8);
        setByteField(term126975, term126975.getClass(), "minute", (byte) 52);
        setByteField(term126975, term126975.getClass(), "second", (byte) 59);
        setIntField(term126975, term126975.getClass(), "nano", 526040172);
        setField(term126970, term126970.getClass(), "time", term126975);
        setField(term126944, term126944.getClass(), "accessTime", term126970);
        setField(term126942, term126942.getClass(), "card", term126944);
        setField(term126942, term126942.getClass(), "userName", "kbySPSiGhF");
        setIntField(term126942, term126942.getClass(), "level", 627174991);
        setIntField(term126942, term126942.getClass(), "reincarnationNum", -115224377);
        setLongField(term126942, term126942.getClass(), "exp", -2701472710952614139L);
        setLongField(term126942, term126942.getClass(), "point", -3144176143609238366L);
        setLongField(term126942, term126942.getClass(), "totalPoint", -8932786716529315605L);
        setIntField(term126942, term126942.getClass(), "playCount", -1415575379);
        setIntField(term126942, term126942.getClass(), "jewelCount", 1957935933);
        setIntField(term126942, term126942.getClass(), "totalJewelCount", -98122007);
        setIntField(term126942, term126942.getClass(), "medalCount", -1291078501);
        setIntField(term126942, term126942.getClass(), "playerRating", -31110918);
        setIntField(term126942, term126942.getClass(), "highestRating", 2050293775);
        setIntField(term126942, term126942.getClass(), "battlePoint", 367669009);
        setIntField(term126942, term126942.getClass(), "bestBattlePoint", 1587942890);
        setIntField(term126942, term126942.getClass(), "overDamageBattlePoint", 168004133);
        setBooleanField(term126942, term126942.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term126942, term126942.getClass(), "nameplateId", -1080740868);
        setIntField(term126942, term126942.getClass(), "trophyId", 1926882468);
        setIntField(term126942, term126942.getClass(), "cardId", 1597443428);
        setIntField(term126942, term126942.getClass(), "characterId", 1327091194);
        setIntField(term126942, term126942.getClass(), "characterVoiceNo", 589230936);
        setIntField(term126942, term126942.getClass(), "tabSetting", -1303562294);
        setIntField(term126942, term126942.getClass(), "tabSortSetting", -604799051);
        setIntField(term126942, term126942.getClass(), "cardCategorySetting", -157085169);
        setIntField(term126942, term126942.getClass(), "cardSortSetting", -1984025761);
        setIntField(term126942, term126942.getClass(), "rivalScoreCategorySetting", 1401125758);
        setIntField(term126942, term126942.getClass(), "playedTutorialBit", 1507564978);
        setIntField(term126942, term126942.getClass(), "firstTutorialCancelNum", -1187537437);
        setLongField(term126942, term126942.getClass(), "sumTechHighScore", -3822011171227049342L);
        setLongField(term126942, term126942.getClass(), "sumTechBasicHighScore", 1210799278706903139L);
        setLongField(term126942, term126942.getClass(), "sumTechAdvancedHighScore", 6936184101975641734L);
        setLongField(term126942, term126942.getClass(), "sumTechExpertHighScore", -7827985551941903873L);
        setLongField(term126942, term126942.getClass(), "sumTechMasterHighScore", 1139683240391645963L);
        setLongField(term126942, term126942.getClass(), "sumTechLunaticHighScore", 3445919844747451814L);
        setLongField(term126942, term126942.getClass(), "sumBattleHighScore", -21850884402467416L);
        setLongField(term126942, term126942.getClass(), "sumBattleBasicHighScore", -6647948426520612492L);
        setLongField(term126942, term126942.getClass(), "sumBattleAdvancedHighScore", 5862011075283777207L);
        setLongField(term126942, term126942.getClass(), "sumBattleExpertHighScore", 6792718804100390621L);
        setLongField(term126942, term126942.getClass(), "sumBattleMasterHighScore", -1362238441895856876L);
        setLongField(term126942, term126942.getClass(), "sumBattleLunaticHighScore", -1657200598224040424L);
        setField(term126942, term126942.getClass(), "eventWatchedDate", "sKCjjNeVoI");
        setField(term126942, term126942.getClass(), "cmEventWatchedDate", "HuoMsoUWrV");
        setField(term126942, term126942.getClass(), "firstGameId", "jCLmdVxyvG");
        setField(term126942, term126942.getClass(), "firstRomVersion", "FYniCuCHuO");
        setField(term126942, term126942.getClass(), "firstDataVersion", "VJXbdWMtjC");
        setField(term126942, term126942.getClass(), "firstPlayDate", "AugzpVbSsO");
        setField(term126942, term126942.getClass(), "lastGameId", "tBGQmugLvu");
        setField(term126942, term126942.getClass(), "lastRomVersion", "oxWULKaNGt");
        setField(term126942, term126942.getClass(), "lastDataVersion", "cbZjrijpVX");
        setField(term126942, term126942.getClass(), "compatibleCmVersion", "OGWRelGqxR");
        setField(term126942, term126942.getClass(), "lastPlayDate", "fKSWVsjAjO");
        setIntField(term126942, term126942.getClass(), "lastPlaceId", 988985229);
        setField(term126942, term126942.getClass(), "lastPlaceName", "mgPzmcygcU");
        setIntField(term126942, term126942.getClass(), "lastRegionId", -1262847411);
        setField(term126942, term126942.getClass(), "lastRegionName", "mvEDoAbPuT");
        setIntField(term126942, term126942.getClass(), "lastAllNetId", -69028914);
        setField(term126942, term126942.getClass(), "lastClientId", "EUWHyMdRKl");
        setIntField(term126942, term126942.getClass(), "lastUsedDeckId", -887976125);
        setIntField(term126942, term126942.getClass(), "lastPlayMusicLevel", 448725036);
        setIntField(term126942, term126942.getClass(), "lastEmoneyBrand", -1464798371);
        setField(term126940, term126940.getClass(), "user", term126942);
        setIntField(term126940, term126940.getClass(), "cardId", -1);
        setIntField(term126940, term126940.getClass(), "digitalStock", 1);
        setIntField(term126940, term126940.getClass(), "analogStock", 528481490);
        setIntField(term126940, term126940.getClass(), "level", -117880593);
        setIntField(term126940, term126940.getClass(), "maxLevel", 10);
        setIntField(term126940, term126940.getClass(), "exp", 482962990);
        setIntField(term126940, term126940.getClass(), "printCount", 694510512);
        setIntField(term126940, term126940.getClass(), "useCount", 1668115404);
        setBooleanField(term126940, term126940.getClass(), "isNew", true);
        setField(term126940, term126940.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term126940, term126940.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term126940, term126940.getClass(), "skillId", -1244092546);
        setBooleanField(term126940, term126940.getClass(), "isAcquired", true);
        setField(term126940, term126940.getClass(), "created", "0000-00-00 00:00:00.0");
        term127285 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term127285;
        callMethod(klass, "setNew", argTypes, term126940, args);
    }

};


