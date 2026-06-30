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

public class UserData_setSumBattleAdvancedHighScore_1913796689100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64358;
     Object term64621;

    public UserData_setSumBattleAdvancedHighScore_1913796689100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64362 = new Long(-1333707622307134180L);
        term64358 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term64360 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64381 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64391 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64358, term64358.getClass(), "id", -7603034666961874453L);
        setLongField(term64360, term64360.getClass(), "id", 6171188519299774487L);
        setField(term64360, term64360.getClass(), "extId", term64362);
        setField(term64360, term64360.getClass(), "luid", "yjmUdvwSdd");
        setIntField(term64377, term64377.getClass(), "year", 2015);
        setShortField(term64377, term64377.getClass(), "month", (short) 5);
        setShortField(term64377, term64377.getClass(), "day", (short) 14);
        setField(term64376, term64376.getClass(), "date", term64377);
        setByteField(term64381, term64381.getClass(), "hour", (byte) 13);
        setByteField(term64381, term64381.getClass(), "minute", (byte) 25);
        setByteField(term64381, term64381.getClass(), "second", (byte) 10);
        setIntField(term64381, term64381.getClass(), "nano", 246578829);
        setField(term64376, term64376.getClass(), "time", term64381);
        setField(term64360, term64360.getClass(), "registerTime", term64376);
        setIntField(term64387, term64387.getClass(), "year", 2028);
        setShortField(term64387, term64387.getClass(), "month", (short) 5);
        setShortField(term64387, term64387.getClass(), "day", (short) 23);
        setField(term64386, term64386.getClass(), "date", term64387);
        setByteField(term64391, term64391.getClass(), "hour", (byte) 6);
        setByteField(term64391, term64391.getClass(), "minute", (byte) 0);
        setByteField(term64391, term64391.getClass(), "second", (byte) 51);
        setIntField(term64391, term64391.getClass(), "nano", 258967293);
        setField(term64386, term64386.getClass(), "time", term64391);
        setField(term64360, term64360.getClass(), "accessTime", term64386);
        setField(term64358, term64358.getClass(), "card", term64360);
        setField(term64358, term64358.getClass(), "userName", "COsGswsrtI");
        setIntField(term64358, term64358.getClass(), "level", 1150713854);
        setIntField(term64358, term64358.getClass(), "reincarnationNum", 999843869);
        setLongField(term64358, term64358.getClass(), "exp", 8409252889039339447L);
        setLongField(term64358, term64358.getClass(), "point", 6113018989695983183L);
        setLongField(term64358, term64358.getClass(), "totalPoint", 7008972996434680296L);
        setIntField(term64358, term64358.getClass(), "playCount", 1047162942);
        setIntField(term64358, term64358.getClass(), "jewelCount", 555668629);
        setIntField(term64358, term64358.getClass(), "totalJewelCount", -704789127);
        setIntField(term64358, term64358.getClass(), "medalCount", 2018335018);
        setIntField(term64358, term64358.getClass(), "playerRating", 524629103);
        setIntField(term64358, term64358.getClass(), "highestRating", 601775827);
        setIntField(term64358, term64358.getClass(), "battlePoint", 1713144877);
        setIntField(term64358, term64358.getClass(), "bestBattlePoint", -513074841);
        setIntField(term64358, term64358.getClass(), "overDamageBattlePoint", -1384079183);
        setBooleanField(term64358, term64358.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term64358, term64358.getClass(), "nameplateId", -1401413822);
        setIntField(term64358, term64358.getClass(), "trophyId", -1735958377);
        setIntField(term64358, term64358.getClass(), "cardId", -477618469);
        setIntField(term64358, term64358.getClass(), "characterId", 117739625);
        setIntField(term64358, term64358.getClass(), "characterVoiceNo", -314816968);
        setIntField(term64358, term64358.getClass(), "tabSetting", -1478972076);
        setIntField(term64358, term64358.getClass(), "tabSortSetting", 828708445);
        setIntField(term64358, term64358.getClass(), "cardCategorySetting", -1198357943);
        setIntField(term64358, term64358.getClass(), "cardSortSetting", 407342373);
        setIntField(term64358, term64358.getClass(), "rivalScoreCategorySetting", 633857490);
        setIntField(term64358, term64358.getClass(), "playedTutorialBit", -602285518);
        setIntField(term64358, term64358.getClass(), "firstTutorialCancelNum", 95548457);
        setLongField(term64358, term64358.getClass(), "sumTechHighScore", 678000773176130475L);
        setLongField(term64358, term64358.getClass(), "sumTechBasicHighScore", -1750640202321719004L);
        setLongField(term64358, term64358.getClass(), "sumTechAdvancedHighScore", -5655330187112396076L);
        setLongField(term64358, term64358.getClass(), "sumTechExpertHighScore", 6764238104675879678L);
        setLongField(term64358, term64358.getClass(), "sumTechMasterHighScore", 3263003405250803159L);
        setLongField(term64358, term64358.getClass(), "sumTechLunaticHighScore", 7457643343142968442L);
        setLongField(term64358, term64358.getClass(), "sumBattleHighScore", -1467781323351622064L);
        setLongField(term64358, term64358.getClass(), "sumBattleBasicHighScore", -5585704080249558832L);
        setLongField(term64358, term64358.getClass(), "sumBattleAdvancedHighScore", 4016618299857011653L);
        setLongField(term64358, term64358.getClass(), "sumBattleExpertHighScore", -8830414189681727376L);
        setLongField(term64358, term64358.getClass(), "sumBattleMasterHighScore", 3804733307680394319L);
        setLongField(term64358, term64358.getClass(), "sumBattleLunaticHighScore", -5476696661208638394L);
        setField(term64358, term64358.getClass(), "eventWatchedDate", "ebUWnoVDmk");
        setField(term64358, term64358.getClass(), "cmEventWatchedDate", "wCcojFgWKb");
        setField(term64358, term64358.getClass(), "firstGameId", "iHtqLPNWTt");
        setField(term64358, term64358.getClass(), "firstRomVersion", "TQgECVDMEf");
        setField(term64358, term64358.getClass(), "firstDataVersion", "KIBOVYItqe");
        setField(term64358, term64358.getClass(), "firstPlayDate", "GUztJeVeCc");
        setField(term64358, term64358.getClass(), "lastGameId", "YNXFGgstqj");
        setField(term64358, term64358.getClass(), "lastRomVersion", "xZTWqxWsAc");
        setField(term64358, term64358.getClass(), "lastDataVersion", "sWchglYniO");
        setField(term64358, term64358.getClass(), "compatibleCmVersion", "lohegbXyjA");
        setField(term64358, term64358.getClass(), "lastPlayDate", "HlddItIexw");
        setIntField(term64358, term64358.getClass(), "lastPlaceId", -652818479);
        setField(term64358, term64358.getClass(), "lastPlaceName", "HnpLvemmRI");
        setIntField(term64358, term64358.getClass(), "lastRegionId", 909221962);
        setField(term64358, term64358.getClass(), "lastRegionName", "dHrIcaTbcS");
        setIntField(term64358, term64358.getClass(), "lastAllNetId", 1036562171);
        setField(term64358, term64358.getClass(), "lastClientId", "tAqyToqusS");
        setIntField(term64358, term64358.getClass(), "lastUsedDeckId", -1176098787);
        setIntField(term64358, term64358.getClass(), "lastPlayMusicLevel", -1108621848);
        setIntField(term64358, term64358.getClass(), "lastEmoneyBrand", 1868049133);
        term64621 = new Long(-2060623851955948674L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term64621;
        callMethod(klass, "setSumBattleAdvancedHighScore", argTypes, term64358, args);
    }

};


