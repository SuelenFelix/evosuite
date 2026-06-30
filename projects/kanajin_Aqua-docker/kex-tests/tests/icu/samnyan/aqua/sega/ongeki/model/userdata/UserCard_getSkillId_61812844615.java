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

public class UserCard_getSkillId_61812844615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119115;

    public UserCard_getSkillId_61812844615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119121 = new Long(5184635470881147510L);
        term119115 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term119117 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term119119 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119150 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119115, term119115.getClass(), "id", 8488448320191878689L);
        setLongField(term119117, term119117.getClass(), "id", -2863975035862603271L);
        setLongField(term119119, term119119.getClass(), "id", -4010115214041392545L);
        setField(term119119, term119119.getClass(), "extId", term119121);
        setField(term119119, term119119.getClass(), "luid", "xEnedKycxs");
        setIntField(term119136, term119136.getClass(), "year", 2013);
        setShortField(term119136, term119136.getClass(), "month", (short) 9);
        setShortField(term119136, term119136.getClass(), "day", (short) 12);
        setField(term119135, term119135.getClass(), "date", term119136);
        setByteField(term119140, term119140.getClass(), "hour", (byte) 19);
        setByteField(term119140, term119140.getClass(), "minute", (byte) 26);
        setByteField(term119140, term119140.getClass(), "second", (byte) 25);
        setIntField(term119140, term119140.getClass(), "nano", 897835144);
        setField(term119135, term119135.getClass(), "time", term119140);
        setField(term119119, term119119.getClass(), "registerTime", term119135);
        setIntField(term119146, term119146.getClass(), "year", 2014);
        setShortField(term119146, term119146.getClass(), "month", (short) 6);
        setShortField(term119146, term119146.getClass(), "day", (short) 17);
        setField(term119145, term119145.getClass(), "date", term119146);
        setByteField(term119150, term119150.getClass(), "hour", (byte) 1);
        setByteField(term119150, term119150.getClass(), "minute", (byte) 42);
        setByteField(term119150, term119150.getClass(), "second", (byte) 16);
        setIntField(term119150, term119150.getClass(), "nano", 607959128);
        setField(term119145, term119145.getClass(), "time", term119150);
        setField(term119119, term119119.getClass(), "accessTime", term119145);
        setField(term119117, term119117.getClass(), "card", term119119);
        setField(term119117, term119117.getClass(), "userName", "prYsWiRHjA");
        setIntField(term119117, term119117.getClass(), "level", -673087697);
        setIntField(term119117, term119117.getClass(), "reincarnationNum", 821580864);
        setLongField(term119117, term119117.getClass(), "exp", 611991742338882331L);
        setLongField(term119117, term119117.getClass(), "point", -4762684541771747375L);
        setLongField(term119117, term119117.getClass(), "totalPoint", -6876300710628578528L);
        setIntField(term119117, term119117.getClass(), "playCount", 210061350);
        setIntField(term119117, term119117.getClass(), "jewelCount", -1315216208);
        setIntField(term119117, term119117.getClass(), "totalJewelCount", -543739494);
        setIntField(term119117, term119117.getClass(), "medalCount", -1959832217);
        setIntField(term119117, term119117.getClass(), "playerRating", 61867422);
        setIntField(term119117, term119117.getClass(), "highestRating", 536970938);
        setIntField(term119117, term119117.getClass(), "battlePoint", 1370836789);
        setIntField(term119117, term119117.getClass(), "bestBattlePoint", -2117537075);
        setIntField(term119117, term119117.getClass(), "overDamageBattlePoint", -707090176);
        setBooleanField(term119117, term119117.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term119117, term119117.getClass(), "nameplateId", -1562747284);
        setIntField(term119117, term119117.getClass(), "trophyId", 1595520482);
        setIntField(term119117, term119117.getClass(), "cardId", 1344577247);
        setIntField(term119117, term119117.getClass(), "characterId", 89754306);
        setIntField(term119117, term119117.getClass(), "characterVoiceNo", -1141919536);
        setIntField(term119117, term119117.getClass(), "tabSetting", 1482082530);
        setIntField(term119117, term119117.getClass(), "tabSortSetting", -1920069753);
        setIntField(term119117, term119117.getClass(), "cardCategorySetting", -740722091);
        setIntField(term119117, term119117.getClass(), "cardSortSetting", -758267649);
        setIntField(term119117, term119117.getClass(), "rivalScoreCategorySetting", 281378461);
        setIntField(term119117, term119117.getClass(), "playedTutorialBit", 1023095456);
        setIntField(term119117, term119117.getClass(), "firstTutorialCancelNum", -1831793787);
        setLongField(term119117, term119117.getClass(), "sumTechHighScore", 7429851199217394608L);
        setLongField(term119117, term119117.getClass(), "sumTechBasicHighScore", 3921884426788904908L);
        setLongField(term119117, term119117.getClass(), "sumTechAdvancedHighScore", -1237733525270115209L);
        setLongField(term119117, term119117.getClass(), "sumTechExpertHighScore", 1147606516738695966L);
        setLongField(term119117, term119117.getClass(), "sumTechMasterHighScore", -6578681972335380132L);
        setLongField(term119117, term119117.getClass(), "sumTechLunaticHighScore", -8752317699940489111L);
        setLongField(term119117, term119117.getClass(), "sumBattleHighScore", 5434575209023198750L);
        setLongField(term119117, term119117.getClass(), "sumBattleBasicHighScore", 7725840165097701315L);
        setLongField(term119117, term119117.getClass(), "sumBattleAdvancedHighScore", 8461427776474793729L);
        setLongField(term119117, term119117.getClass(), "sumBattleExpertHighScore", 7158622075119287203L);
        setLongField(term119117, term119117.getClass(), "sumBattleMasterHighScore", -6564323490735734506L);
        setLongField(term119117, term119117.getClass(), "sumBattleLunaticHighScore", 2835318688230788293L);
        setField(term119117, term119117.getClass(), "eventWatchedDate", "aQbBLDuBpT");
        setField(term119117, term119117.getClass(), "cmEventWatchedDate", "lUpbmUdjAa");
        setField(term119117, term119117.getClass(), "firstGameId", "KPnQVYAkIf");
        setField(term119117, term119117.getClass(), "firstRomVersion", "BrYcEZSDFU");
        setField(term119117, term119117.getClass(), "firstDataVersion", "fXhQVbntXX");
        setField(term119117, term119117.getClass(), "firstPlayDate", "GdsYFhpAsv");
        setField(term119117, term119117.getClass(), "lastGameId", "JyeOfYxCgA");
        setField(term119117, term119117.getClass(), "lastRomVersion", "yICoZygmis");
        setField(term119117, term119117.getClass(), "lastDataVersion", "jkpqjRyuQn");
        setField(term119117, term119117.getClass(), "compatibleCmVersion", "VyUAUXqMnJ");
        setField(term119117, term119117.getClass(), "lastPlayDate", "kpIzuOxHoi");
        setIntField(term119117, term119117.getClass(), "lastPlaceId", 1354308528);
        setField(term119117, term119117.getClass(), "lastPlaceName", "HnyxpTbQyj");
        setIntField(term119117, term119117.getClass(), "lastRegionId", -1618737502);
        setField(term119117, term119117.getClass(), "lastRegionName", "jCoeBTGJOl");
        setIntField(term119117, term119117.getClass(), "lastAllNetId", 1179678118);
        setField(term119117, term119117.getClass(), "lastClientId", "RpcnPMoqQP");
        setIntField(term119117, term119117.getClass(), "lastUsedDeckId", -806431195);
        setIntField(term119117, term119117.getClass(), "lastPlayMusicLevel", 2080180241);
        setIntField(term119117, term119117.getClass(), "lastEmoneyBrand", 346704875);
        setField(term119115, term119115.getClass(), "user", term119117);
        setIntField(term119115, term119115.getClass(), "cardId", -1);
        setIntField(term119115, term119115.getClass(), "digitalStock", 1);
        setIntField(term119115, term119115.getClass(), "analogStock", -646622035);
        setIntField(term119115, term119115.getClass(), "level", 1580829674);
        setIntField(term119115, term119115.getClass(), "maxLevel", 10);
        setIntField(term119115, term119115.getClass(), "exp", 342864345);
        setIntField(term119115, term119115.getClass(), "printCount", -36841626);
        setIntField(term119115, term119115.getClass(), "useCount", -1582406508);
        setBooleanField(term119115, term119115.getClass(), "isNew", true);
        setField(term119115, term119115.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term119115, term119115.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term119115, term119115.getClass(), "skillId", -1736374121);
        setBooleanField(term119115, term119115.getClass(), "isAcquired", true);
        setField(term119115, term119115.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term119115, args);
    }

};


