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

public class UserOption_setDispBP_48849114777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344520;
     Object term344822;

    public UserOption_setDispBP_48849114777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term344526 = new Long(-4318584834500248968L);
        term344520 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term344522 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term344524 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term344540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term344550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344555 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term344520, term344520.getClass(), "id", 5637002615532145314L);
        setLongField(term344522, term344522.getClass(), "id", -1690941688723113172L);
        setLongField(term344524, term344524.getClass(), "id", 8368814906758888284L);
        setField(term344524, term344524.getClass(), "extId", term344526);
        setField(term344524, term344524.getClass(), "luid", "pCQEQcJECm");
        setIntField(term344541, term344541.getClass(), "year", 2017);
        setShortField(term344541, term344541.getClass(), "month", (short) 3);
        setShortField(term344541, term344541.getClass(), "day", (short) 28);
        setField(term344540, term344540.getClass(), "date", term344541);
        setByteField(term344545, term344545.getClass(), "hour", (byte) 3);
        setByteField(term344545, term344545.getClass(), "minute", (byte) 48);
        setByteField(term344545, term344545.getClass(), "second", (byte) 56);
        setIntField(term344545, term344545.getClass(), "nano", 744640984);
        setField(term344540, term344540.getClass(), "time", term344545);
        setField(term344524, term344524.getClass(), "registerTime", term344540);
        setIntField(term344551, term344551.getClass(), "year", 2010);
        setShortField(term344551, term344551.getClass(), "month", (short) 10);
        setShortField(term344551, term344551.getClass(), "day", (short) 9);
        setField(term344550, term344550.getClass(), "date", term344551);
        setByteField(term344555, term344555.getClass(), "hour", (byte) 19);
        setByteField(term344555, term344555.getClass(), "minute", (byte) 0);
        setByteField(term344555, term344555.getClass(), "second", (byte) 53);
        setIntField(term344555, term344555.getClass(), "nano", 515378725);
        setField(term344550, term344550.getClass(), "time", term344555);
        setField(term344524, term344524.getClass(), "accessTime", term344550);
        setField(term344522, term344522.getClass(), "card", term344524);
        setField(term344522, term344522.getClass(), "userName", "txMVJwyKew");
        setIntField(term344522, term344522.getClass(), "level", 1780252787);
        setIntField(term344522, term344522.getClass(), "reincarnationNum", 336902594);
        setLongField(term344522, term344522.getClass(), "exp", -4773655012649512514L);
        setLongField(term344522, term344522.getClass(), "point", -499412367823954439L);
        setLongField(term344522, term344522.getClass(), "totalPoint", 9042332521550240910L);
        setIntField(term344522, term344522.getClass(), "playCount", 2077151107);
        setIntField(term344522, term344522.getClass(), "jewelCount", 1496911063);
        setIntField(term344522, term344522.getClass(), "totalJewelCount", -530622611);
        setIntField(term344522, term344522.getClass(), "medalCount", -706366573);
        setIntField(term344522, term344522.getClass(), "playerRating", -22867344);
        setIntField(term344522, term344522.getClass(), "highestRating", -510774872);
        setIntField(term344522, term344522.getClass(), "battlePoint", -1105898284);
        setIntField(term344522, term344522.getClass(), "bestBattlePoint", -1824588871);
        setIntField(term344522, term344522.getClass(), "overDamageBattlePoint", 880022277);
        setBooleanField(term344522, term344522.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term344522, term344522.getClass(), "nameplateId", -1876545561);
        setIntField(term344522, term344522.getClass(), "trophyId", 1577196058);
        setIntField(term344522, term344522.getClass(), "cardId", -1764173170);
        setIntField(term344522, term344522.getClass(), "characterId", 1395719969);
        setIntField(term344522, term344522.getClass(), "characterVoiceNo", -674781917);
        setIntField(term344522, term344522.getClass(), "tabSetting", -237391583);
        setIntField(term344522, term344522.getClass(), "tabSortSetting", -1381301432);
        setIntField(term344522, term344522.getClass(), "cardCategorySetting", -2144324925);
        setIntField(term344522, term344522.getClass(), "cardSortSetting", 1774236307);
        setIntField(term344522, term344522.getClass(), "rivalScoreCategorySetting", -1847108627);
        setIntField(term344522, term344522.getClass(), "playedTutorialBit", 1098824608);
        setIntField(term344522, term344522.getClass(), "firstTutorialCancelNum", 859271394);
        setLongField(term344522, term344522.getClass(), "sumTechHighScore", 2604333193012314887L);
        setLongField(term344522, term344522.getClass(), "sumTechBasicHighScore", 4348454904617476047L);
        setLongField(term344522, term344522.getClass(), "sumTechAdvancedHighScore", 3897769262332330257L);
        setLongField(term344522, term344522.getClass(), "sumTechExpertHighScore", 5677798885268740169L);
        setLongField(term344522, term344522.getClass(), "sumTechMasterHighScore", 3978236751794809960L);
        setLongField(term344522, term344522.getClass(), "sumTechLunaticHighScore", -602974447902342459L);
        setLongField(term344522, term344522.getClass(), "sumBattleHighScore", 5173141392586934054L);
        setLongField(term344522, term344522.getClass(), "sumBattleBasicHighScore", 1467681699536172461L);
        setLongField(term344522, term344522.getClass(), "sumBattleAdvancedHighScore", 5521318091287440752L);
        setLongField(term344522, term344522.getClass(), "sumBattleExpertHighScore", -5067438703484587788L);
        setLongField(term344522, term344522.getClass(), "sumBattleMasterHighScore", -9005147287615815174L);
        setLongField(term344522, term344522.getClass(), "sumBattleLunaticHighScore", 1467924625640671283L);
        setField(term344522, term344522.getClass(), "eventWatchedDate", "UkaVhzQDYH");
        setField(term344522, term344522.getClass(), "cmEventWatchedDate", "CWsmgCbGrE");
        setField(term344522, term344522.getClass(), "firstGameId", "zbccCFEKkz");
        setField(term344522, term344522.getClass(), "firstRomVersion", "twPWbKDKMN");
        setField(term344522, term344522.getClass(), "firstDataVersion", "swROZVXSzP");
        setField(term344522, term344522.getClass(), "firstPlayDate", "THTEzKxcpB");
        setField(term344522, term344522.getClass(), "lastGameId", "yZdNRziIaS");
        setField(term344522, term344522.getClass(), "lastRomVersion", "CUvjRUNPgZ");
        setField(term344522, term344522.getClass(), "lastDataVersion", "HPchqJdcNc");
        setField(term344522, term344522.getClass(), "compatibleCmVersion", "IjYnxKNZdj");
        setField(term344522, term344522.getClass(), "lastPlayDate", "CNpBuVsEiX");
        setIntField(term344522, term344522.getClass(), "lastPlaceId", -18503845);
        setField(term344522, term344522.getClass(), "lastPlaceName", "oxIMVmoSmt");
        setIntField(term344522, term344522.getClass(), "lastRegionId", -1926943845);
        setField(term344522, term344522.getClass(), "lastRegionName", "wRRyuzlHwQ");
        setIntField(term344522, term344522.getClass(), "lastAllNetId", 1703500212);
        setField(term344522, term344522.getClass(), "lastClientId", "WnDiKHdBLt");
        setIntField(term344522, term344522.getClass(), "lastUsedDeckId", 663639421);
        setIntField(term344522, term344522.getClass(), "lastPlayMusicLevel", 291080974);
        setIntField(term344522, term344522.getClass(), "lastEmoneyBrand", -641625454);
        setField(term344520, term344520.getClass(), "user", term344522);
        setIntField(term344520, term344520.getClass(), "optionSet", -1600766931);
        setIntField(term344520, term344520.getClass(), "speed", 503141615);
        setIntField(term344520, term344520.getClass(), "mirror", -923382668);
        setIntField(term344520, term344520.getClass(), "judgeTiming", 1815045623);
        setIntField(term344520, term344520.getClass(), "judgeAdjustment", 1326817444);
        setIntField(term344520, term344520.getClass(), "abort", 1307368584);
        setIntField(term344520, term344520.getClass(), "stealthField", 2101516428);
        setIntField(term344520, term344520.getClass(), "tapSound", 464519782);
        setIntField(term344520, term344520.getClass(), "volGuide", -52954047);
        setIntField(term344520, term344520.getClass(), "volAll", -620926886);
        setIntField(term344520, term344520.getClass(), "volTap", 1648336339);
        setIntField(term344520, term344520.getClass(), "volCrTap", 235833310);
        setIntField(term344520, term344520.getClass(), "volHold", 1486076581);
        setIntField(term344520, term344520.getClass(), "volSide", 1621795408);
        setIntField(term344520, term344520.getClass(), "volFlick", -1992736826);
        setIntField(term344520, term344520.getClass(), "volBell", 339632380);
        setIntField(term344520, term344520.getClass(), "volEnemy", -858945783);
        setIntField(term344520, term344520.getClass(), "volSkill", 1679351427);
        setIntField(term344520, term344520.getClass(), "volDamage", 1751613094);
        setIntField(term344520, term344520.getClass(), "colorField", 234785131);
        setIntField(term344520, term344520.getClass(), "colorLaneBright", 681149351);
        setIntField(term344520, term344520.getClass(), "colorWallBright", -1907521328);
        setIntField(term344520, term344520.getClass(), "colorLane", -1277683845);
        setIntField(term344520, term344520.getClass(), "colorSide", 650528666);
        setIntField(term344520, term344520.getClass(), "effectDamage", -1993469096);
        setIntField(term344520, term344520.getClass(), "effectPos", 470308773);
        setIntField(term344520, term344520.getClass(), "judgeDisp", -737959846);
        setIntField(term344520, term344520.getClass(), "judgePos", 1364676016);
        setIntField(term344520, term344520.getClass(), "judgeBreak", 967252350);
        setIntField(term344520, term344520.getClass(), "judgeHit", 763123739);
        setIntField(term344520, term344520.getClass(), "platinumBreakDisp", -1830705943);
        setIntField(term344520, term344520.getClass(), "judgeCriticalBreak", -862161476);
        setIntField(term344520, term344520.getClass(), "matching", -85797853);
        setIntField(term344520, term344520.getClass(), "dispPlayerLv", 478488394);
        setIntField(term344520, term344520.getClass(), "dispRating", 1401128739);
        setIntField(term344520, term344520.getClass(), "dispBP", 591105329);
        setIntField(term344520, term344520.getClass(), "headphone", -128994206);
        term344822 = new Integer(-588911401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term344822;
        callMethod(klass, "setDispBP", argTypes, term344520, args);
    }

};


