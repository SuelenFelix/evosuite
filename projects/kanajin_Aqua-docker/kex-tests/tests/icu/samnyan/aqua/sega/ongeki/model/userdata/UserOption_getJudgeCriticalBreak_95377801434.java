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

public class UserOption_getJudgeCriticalBreak_95377801434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324159;

    public UserOption_getJudgeCriticalBreak_95377801434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324165 = new Long(2243864141567980599L);
        term324159 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term324161 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term324163 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term324179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324194 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term324159, term324159.getClass(), "id", 1733296376053221185L);
        setLongField(term324161, term324161.getClass(), "id", -49278332056294755L);
        setLongField(term324163, term324163.getClass(), "id", 5712977524221927538L);
        setField(term324163, term324163.getClass(), "extId", term324165);
        setField(term324163, term324163.getClass(), "luid", "LCusuzFqpc");
        setIntField(term324180, term324180.getClass(), "year", 2010);
        setShortField(term324180, term324180.getClass(), "month", (short) 8);
        setShortField(term324180, term324180.getClass(), "day", (short) 11);
        setField(term324179, term324179.getClass(), "date", term324180);
        setByteField(term324184, term324184.getClass(), "hour", (byte) 21);
        setByteField(term324184, term324184.getClass(), "minute", (byte) 35);
        setByteField(term324184, term324184.getClass(), "second", (byte) 27);
        setIntField(term324184, term324184.getClass(), "nano", 846800281);
        setField(term324179, term324179.getClass(), "time", term324184);
        setField(term324163, term324163.getClass(), "registerTime", term324179);
        setIntField(term324190, term324190.getClass(), "year", 2025);
        setShortField(term324190, term324190.getClass(), "month", (short) 3);
        setShortField(term324190, term324190.getClass(), "day", (short) 3);
        setField(term324189, term324189.getClass(), "date", term324190);
        setByteField(term324194, term324194.getClass(), "hour", (byte) 16);
        setByteField(term324194, term324194.getClass(), "minute", (byte) 22);
        setByteField(term324194, term324194.getClass(), "second", (byte) 31);
        setIntField(term324194, term324194.getClass(), "nano", 349601000);
        setField(term324189, term324189.getClass(), "time", term324194);
        setField(term324163, term324163.getClass(), "accessTime", term324189);
        setField(term324161, term324161.getClass(), "card", term324163);
        setField(term324161, term324161.getClass(), "userName", "SYJGSKenur");
        setIntField(term324161, term324161.getClass(), "level", -1428023132);
        setIntField(term324161, term324161.getClass(), "reincarnationNum", 1872761499);
        setLongField(term324161, term324161.getClass(), "exp", -2158309496295432310L);
        setLongField(term324161, term324161.getClass(), "point", 3584248206433006560L);
        setLongField(term324161, term324161.getClass(), "totalPoint", 4555054032320658658L);
        setIntField(term324161, term324161.getClass(), "playCount", 1543055288);
        setIntField(term324161, term324161.getClass(), "jewelCount", -1912897500);
        setIntField(term324161, term324161.getClass(), "totalJewelCount", 1686973815);
        setIntField(term324161, term324161.getClass(), "medalCount", 280914735);
        setIntField(term324161, term324161.getClass(), "playerRating", -1728880385);
        setIntField(term324161, term324161.getClass(), "highestRating", 258346985);
        setIntField(term324161, term324161.getClass(), "battlePoint", 740436525);
        setIntField(term324161, term324161.getClass(), "bestBattlePoint", -917248016);
        setIntField(term324161, term324161.getClass(), "overDamageBattlePoint", 859049236);
        setBooleanField(term324161, term324161.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term324161, term324161.getClass(), "nameplateId", 1834375406);
        setIntField(term324161, term324161.getClass(), "trophyId", 1796769631);
        setIntField(term324161, term324161.getClass(), "cardId", -781796868);
        setIntField(term324161, term324161.getClass(), "characterId", -1854861178);
        setIntField(term324161, term324161.getClass(), "characterVoiceNo", 1594565852);
        setIntField(term324161, term324161.getClass(), "tabSetting", 1640238796);
        setIntField(term324161, term324161.getClass(), "tabSortSetting", -1522683775);
        setIntField(term324161, term324161.getClass(), "cardCategorySetting", 1180776013);
        setIntField(term324161, term324161.getClass(), "cardSortSetting", -746015610);
        setIntField(term324161, term324161.getClass(), "rivalScoreCategorySetting", 923745459);
        setIntField(term324161, term324161.getClass(), "playedTutorialBit", -1130552959);
        setIntField(term324161, term324161.getClass(), "firstTutorialCancelNum", 1534812995);
        setLongField(term324161, term324161.getClass(), "sumTechHighScore", -1401475242920748177L);
        setLongField(term324161, term324161.getClass(), "sumTechBasicHighScore", -2616732894167339854L);
        setLongField(term324161, term324161.getClass(), "sumTechAdvancedHighScore", -3369268748533770418L);
        setLongField(term324161, term324161.getClass(), "sumTechExpertHighScore", 7595597842799178352L);
        setLongField(term324161, term324161.getClass(), "sumTechMasterHighScore", 4717095693258406595L);
        setLongField(term324161, term324161.getClass(), "sumTechLunaticHighScore", 6364244226611638114L);
        setLongField(term324161, term324161.getClass(), "sumBattleHighScore", -3801947479253982931L);
        setLongField(term324161, term324161.getClass(), "sumBattleBasicHighScore", -8046352370831963841L);
        setLongField(term324161, term324161.getClass(), "sumBattleAdvancedHighScore", -534091537107292345L);
        setLongField(term324161, term324161.getClass(), "sumBattleExpertHighScore", 5731389766017718037L);
        setLongField(term324161, term324161.getClass(), "sumBattleMasterHighScore", -5553925367701134167L);
        setLongField(term324161, term324161.getClass(), "sumBattleLunaticHighScore", -4030286020150003602L);
        setField(term324161, term324161.getClass(), "eventWatchedDate", "gYBTavQHQn");
        setField(term324161, term324161.getClass(), "cmEventWatchedDate", "rugveEdnoH");
        setField(term324161, term324161.getClass(), "firstGameId", "DyXlCBxVBN");
        setField(term324161, term324161.getClass(), "firstRomVersion", "gZiyqZyzjj");
        setField(term324161, term324161.getClass(), "firstDataVersion", "MzrWjTTjQk");
        setField(term324161, term324161.getClass(), "firstPlayDate", "EipAhKwvPb");
        setField(term324161, term324161.getClass(), "lastGameId", "FfSkcRqLCJ");
        setField(term324161, term324161.getClass(), "lastRomVersion", "jVqOTMMyXD");
        setField(term324161, term324161.getClass(), "lastDataVersion", "gzWIdCZVdf");
        setField(term324161, term324161.getClass(), "compatibleCmVersion", "vecjFQrCpq");
        setField(term324161, term324161.getClass(), "lastPlayDate", "YVRMBnXUrM");
        setIntField(term324161, term324161.getClass(), "lastPlaceId", -1809063858);
        setField(term324161, term324161.getClass(), "lastPlaceName", "laNnwVplyw");
        setIntField(term324161, term324161.getClass(), "lastRegionId", -194387356);
        setField(term324161, term324161.getClass(), "lastRegionName", "ezAIkQcDih");
        setIntField(term324161, term324161.getClass(), "lastAllNetId", 1843600084);
        setField(term324161, term324161.getClass(), "lastClientId", "XCLTNUXLDK");
        setIntField(term324161, term324161.getClass(), "lastUsedDeckId", -5174061);
        setIntField(term324161, term324161.getClass(), "lastPlayMusicLevel", -1230742841);
        setIntField(term324161, term324161.getClass(), "lastEmoneyBrand", -1939415532);
        setField(term324159, term324159.getClass(), "user", term324161);
        setIntField(term324159, term324159.getClass(), "optionSet", -1043914893);
        setIntField(term324159, term324159.getClass(), "speed", 1724704495);
        setIntField(term324159, term324159.getClass(), "mirror", -1115817572);
        setIntField(term324159, term324159.getClass(), "judgeTiming", -153289743);
        setIntField(term324159, term324159.getClass(), "judgeAdjustment", -838732558);
        setIntField(term324159, term324159.getClass(), "abort", 322567495);
        setIntField(term324159, term324159.getClass(), "stealthField", 914041007);
        setIntField(term324159, term324159.getClass(), "tapSound", 1040995446);
        setIntField(term324159, term324159.getClass(), "volGuide", -1369029298);
        setIntField(term324159, term324159.getClass(), "volAll", 528919479);
        setIntField(term324159, term324159.getClass(), "volTap", 1434512261);
        setIntField(term324159, term324159.getClass(), "volCrTap", 2123021311);
        setIntField(term324159, term324159.getClass(), "volHold", 490412264);
        setIntField(term324159, term324159.getClass(), "volSide", 1513761280);
        setIntField(term324159, term324159.getClass(), "volFlick", -1946742560);
        setIntField(term324159, term324159.getClass(), "volBell", -1664149601);
        setIntField(term324159, term324159.getClass(), "volEnemy", -113939247);
        setIntField(term324159, term324159.getClass(), "volSkill", 214605498);
        setIntField(term324159, term324159.getClass(), "volDamage", 1703247021);
        setIntField(term324159, term324159.getClass(), "colorField", 677161777);
        setIntField(term324159, term324159.getClass(), "colorLaneBright", 964585800);
        setIntField(term324159, term324159.getClass(), "colorWallBright", 820833673);
        setIntField(term324159, term324159.getClass(), "colorLane", 507620384);
        setIntField(term324159, term324159.getClass(), "colorSide", 990688429);
        setIntField(term324159, term324159.getClass(), "effectDamage", 721943680);
        setIntField(term324159, term324159.getClass(), "effectPos", 894874766);
        setIntField(term324159, term324159.getClass(), "judgeDisp", -236070883);
        setIntField(term324159, term324159.getClass(), "judgePos", 1543891132);
        setIntField(term324159, term324159.getClass(), "judgeBreak", -1639326299);
        setIntField(term324159, term324159.getClass(), "judgeHit", -2019676895);
        setIntField(term324159, term324159.getClass(), "platinumBreakDisp", 840784345);
        setIntField(term324159, term324159.getClass(), "judgeCriticalBreak", -1630100339);
        setIntField(term324159, term324159.getClass(), "matching", 1973238817);
        setIntField(term324159, term324159.getClass(), "dispPlayerLv", 459989948);
        setIntField(term324159, term324159.getClass(), "dispRating", -936888895);
        setIntField(term324159, term324159.getClass(), "dispBP", -1994397463);
        setIntField(term324159, term324159.getClass(), "headphone", -619864294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeCriticalBreak", argTypes, term324159, args);
    }

};


