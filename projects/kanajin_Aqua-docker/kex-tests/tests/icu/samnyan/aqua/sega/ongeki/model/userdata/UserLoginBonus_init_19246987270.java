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

public class UserLoginBonus_init_19246987270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300809;

    public UserLoginBonus_init_19246987270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term300813 = new Long(204473662283899955L);
        term300809 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term300811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term300827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term300809, term300809.getClass(), "id", -4612766557242605257L);
        setLongField(term300811, term300811.getClass(), "id", 3359362130942693590L);
        setField(term300811, term300811.getClass(), "extId", term300813);
        setField(term300811, term300811.getClass(), "luid", "mSmFFGfsFJ");
        setIntField(term300828, term300828.getClass(), "year", 2027);
        setShortField(term300828, term300828.getClass(), "month", (short) 11);
        setShortField(term300828, term300828.getClass(), "day", (short) 16);
        setField(term300827, term300827.getClass(), "date", term300828);
        setByteField(term300832, term300832.getClass(), "hour", (byte) 10);
        setByteField(term300832, term300832.getClass(), "minute", (byte) 57);
        setByteField(term300832, term300832.getClass(), "second", (byte) 50);
        setIntField(term300832, term300832.getClass(), "nano", 260506114);
        setField(term300827, term300827.getClass(), "time", term300832);
        setField(term300811, term300811.getClass(), "registerTime", term300827);
        setIntField(term300838, term300838.getClass(), "year", 2010);
        setShortField(term300838, term300838.getClass(), "month", (short) 9);
        setShortField(term300838, term300838.getClass(), "day", (short) 3);
        setField(term300837, term300837.getClass(), "date", term300838);
        setByteField(term300842, term300842.getClass(), "hour", (byte) 10);
        setByteField(term300842, term300842.getClass(), "minute", (byte) 46);
        setByteField(term300842, term300842.getClass(), "second", (byte) 49);
        setIntField(term300842, term300842.getClass(), "nano", 392327328);
        setField(term300837, term300837.getClass(), "time", term300842);
        setField(term300811, term300811.getClass(), "accessTime", term300837);
        setField(term300809, term300809.getClass(), "card", term300811);
        setField(term300809, term300809.getClass(), "userName", "OIzsTPqaal");
        setIntField(term300809, term300809.getClass(), "level", 295491167);
        setIntField(term300809, term300809.getClass(), "reincarnationNum", -1830981692);
        setLongField(term300809, term300809.getClass(), "exp", -1334322931868696260L);
        setLongField(term300809, term300809.getClass(), "point", -5433106277358824893L);
        setLongField(term300809, term300809.getClass(), "totalPoint", -3099085938972410974L);
        setIntField(term300809, term300809.getClass(), "playCount", -154584033);
        setIntField(term300809, term300809.getClass(), "jewelCount", -1099312590);
        setIntField(term300809, term300809.getClass(), "totalJewelCount", -1960099382);
        setIntField(term300809, term300809.getClass(), "medalCount", 487337800);
        setIntField(term300809, term300809.getClass(), "playerRating", 359514248);
        setIntField(term300809, term300809.getClass(), "highestRating", -739968237);
        setIntField(term300809, term300809.getClass(), "battlePoint", 453115532);
        setIntField(term300809, term300809.getClass(), "bestBattlePoint", 1278298154);
        setIntField(term300809, term300809.getClass(), "overDamageBattlePoint", 938868528);
        setBooleanField(term300809, term300809.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term300809, term300809.getClass(), "nameplateId", 120458932);
        setIntField(term300809, term300809.getClass(), "trophyId", 76041751);
        setIntField(term300809, term300809.getClass(), "cardId", 1049789941);
        setIntField(term300809, term300809.getClass(), "characterId", 1294058665);
        setIntField(term300809, term300809.getClass(), "characterVoiceNo", -1247120882);
        setIntField(term300809, term300809.getClass(), "tabSetting", -1245032854);
        setIntField(term300809, term300809.getClass(), "tabSortSetting", 1753580502);
        setIntField(term300809, term300809.getClass(), "cardCategorySetting", 937744373);
        setIntField(term300809, term300809.getClass(), "cardSortSetting", -2116018442);
        setIntField(term300809, term300809.getClass(), "rivalScoreCategorySetting", -257544793);
        setIntField(term300809, term300809.getClass(), "playedTutorialBit", -1653237082);
        setIntField(term300809, term300809.getClass(), "firstTutorialCancelNum", -562763207);
        setLongField(term300809, term300809.getClass(), "sumTechHighScore", 6882516721174880006L);
        setLongField(term300809, term300809.getClass(), "sumTechBasicHighScore", -4773269591401966766L);
        setLongField(term300809, term300809.getClass(), "sumTechAdvancedHighScore", -8922411821974555374L);
        setLongField(term300809, term300809.getClass(), "sumTechExpertHighScore", 5999972210213791905L);
        setLongField(term300809, term300809.getClass(), "sumTechMasterHighScore", -1100607572214197093L);
        setLongField(term300809, term300809.getClass(), "sumTechLunaticHighScore", -7229857911200997492L);
        setLongField(term300809, term300809.getClass(), "sumBattleHighScore", 1629629999232236028L);
        setLongField(term300809, term300809.getClass(), "sumBattleBasicHighScore", -3806994214935837115L);
        setLongField(term300809, term300809.getClass(), "sumBattleAdvancedHighScore", 2110048969879638491L);
        setLongField(term300809, term300809.getClass(), "sumBattleExpertHighScore", 9051281737253281774L);
        setLongField(term300809, term300809.getClass(), "sumBattleMasterHighScore", 8126221157916248970L);
        setLongField(term300809, term300809.getClass(), "sumBattleLunaticHighScore", 1400820084955568035L);
        setField(term300809, term300809.getClass(), "eventWatchedDate", "oKvuWLXCZe");
        setField(term300809, term300809.getClass(), "cmEventWatchedDate", "mlmKXwlNne");
        setField(term300809, term300809.getClass(), "firstGameId", "zzuYlgHeZM");
        setField(term300809, term300809.getClass(), "firstRomVersion", "WiwGVcBPdh");
        setField(term300809, term300809.getClass(), "firstDataVersion", "CAnHJCftOL");
        setField(term300809, term300809.getClass(), "firstPlayDate", "IqESuvplNO");
        setField(term300809, term300809.getClass(), "lastGameId", "MuPoSwJnZo");
        setField(term300809, term300809.getClass(), "lastRomVersion", "EmSAPRRxNg");
        setField(term300809, term300809.getClass(), "lastDataVersion", "fthdIgFyPe");
        setField(term300809, term300809.getClass(), "compatibleCmVersion", "ZdzOASPfVr");
        setField(term300809, term300809.getClass(), "lastPlayDate", "uYcMmnQOMD");
        setIntField(term300809, term300809.getClass(), "lastPlaceId", 1405119430);
        setField(term300809, term300809.getClass(), "lastPlaceName", "qqlqorfOrc");
        setIntField(term300809, term300809.getClass(), "lastRegionId", -161447198);
        setField(term300809, term300809.getClass(), "lastRegionName", "mwapivGBrr");
        setIntField(term300809, term300809.getClass(), "lastAllNetId", -1588843736);
        setField(term300809, term300809.getClass(), "lastClientId", "noUqCHRNIJ");
        setIntField(term300809, term300809.getClass(), "lastUsedDeckId", 890916272);
        setIntField(term300809, term300809.getClass(), "lastPlayMusicLevel", -1193989827);
        setIntField(term300809, term300809.getClass(), "lastEmoneyBrand", 1239736379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term300809;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


