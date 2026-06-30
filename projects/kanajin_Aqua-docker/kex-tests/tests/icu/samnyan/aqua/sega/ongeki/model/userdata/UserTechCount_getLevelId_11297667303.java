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

public class UserTechCount_getLevelId_11297667303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362969;

    public UserTechCount_getLevelId_11297667303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term362975 = new Long(2923644849350978175L);
        term362969 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term362971 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term362973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term362989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term362990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term362994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term362999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term362969, term362969.getClass(), "id", 1389259975463128479L);
        setLongField(term362971, term362971.getClass(), "id", 4436446912745843549L);
        setLongField(term362973, term362973.getClass(), "id", -1064790444170763405L);
        setField(term362973, term362973.getClass(), "extId", term362975);
        setField(term362973, term362973.getClass(), "luid", "gIVxxnuVFq");
        setIntField(term362990, term362990.getClass(), "year", 2021);
        setShortField(term362990, term362990.getClass(), "month", (short) 12);
        setShortField(term362990, term362990.getClass(), "day", (short) 15);
        setField(term362989, term362989.getClass(), "date", term362990);
        setByteField(term362994, term362994.getClass(), "hour", (byte) 22);
        setByteField(term362994, term362994.getClass(), "minute", (byte) 35);
        setByteField(term362994, term362994.getClass(), "second", (byte) 40);
        setIntField(term362994, term362994.getClass(), "nano", 5470936);
        setField(term362989, term362989.getClass(), "time", term362994);
        setField(term362973, term362973.getClass(), "registerTime", term362989);
        setIntField(term363000, term363000.getClass(), "year", 2013);
        setShortField(term363000, term363000.getClass(), "month", (short) 6);
        setShortField(term363000, term363000.getClass(), "day", (short) 10);
        setField(term362999, term362999.getClass(), "date", term363000);
        setByteField(term363004, term363004.getClass(), "hour", (byte) 8);
        setByteField(term363004, term363004.getClass(), "minute", (byte) 7);
        setByteField(term363004, term363004.getClass(), "second", (byte) 23);
        setIntField(term363004, term363004.getClass(), "nano", 111268981);
        setField(term362999, term362999.getClass(), "time", term363004);
        setField(term362973, term362973.getClass(), "accessTime", term362999);
        setField(term362971, term362971.getClass(), "card", term362973);
        setField(term362971, term362971.getClass(), "userName", "rHnHNeNRWU");
        setIntField(term362971, term362971.getClass(), "level", 1241233395);
        setIntField(term362971, term362971.getClass(), "reincarnationNum", -624733254);
        setLongField(term362971, term362971.getClass(), "exp", -454946010819066583L);
        setLongField(term362971, term362971.getClass(), "point", 4575599297707515869L);
        setLongField(term362971, term362971.getClass(), "totalPoint", -1945342454134464434L);
        setIntField(term362971, term362971.getClass(), "playCount", -1922668581);
        setIntField(term362971, term362971.getClass(), "jewelCount", 590065621);
        setIntField(term362971, term362971.getClass(), "totalJewelCount", -1323971161);
        setIntField(term362971, term362971.getClass(), "medalCount", 174703490);
        setIntField(term362971, term362971.getClass(), "playerRating", -1413871287);
        setIntField(term362971, term362971.getClass(), "highestRating", -662695417);
        setIntField(term362971, term362971.getClass(), "battlePoint", 997413220);
        setIntField(term362971, term362971.getClass(), "bestBattlePoint", -613869973);
        setIntField(term362971, term362971.getClass(), "overDamageBattlePoint", -1549954201);
        setBooleanField(term362971, term362971.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term362971, term362971.getClass(), "nameplateId", -2077556468);
        setIntField(term362971, term362971.getClass(), "trophyId", -1285403346);
        setIntField(term362971, term362971.getClass(), "cardId", -46908055);
        setIntField(term362971, term362971.getClass(), "characterId", -692658978);
        setIntField(term362971, term362971.getClass(), "characterVoiceNo", -2134617774);
        setIntField(term362971, term362971.getClass(), "tabSetting", -2007628524);
        setIntField(term362971, term362971.getClass(), "tabSortSetting", -1471992097);
        setIntField(term362971, term362971.getClass(), "cardCategorySetting", 464316071);
        setIntField(term362971, term362971.getClass(), "cardSortSetting", -2059307821);
        setIntField(term362971, term362971.getClass(), "rivalScoreCategorySetting", -132446588);
        setIntField(term362971, term362971.getClass(), "playedTutorialBit", -395123356);
        setIntField(term362971, term362971.getClass(), "firstTutorialCancelNum", 2090560888);
        setLongField(term362971, term362971.getClass(), "sumTechHighScore", 9196906632280393954L);
        setLongField(term362971, term362971.getClass(), "sumTechBasicHighScore", -7703139201361497080L);
        setLongField(term362971, term362971.getClass(), "sumTechAdvancedHighScore", 1439142893512788010L);
        setLongField(term362971, term362971.getClass(), "sumTechExpertHighScore", 8216837982830270154L);
        setLongField(term362971, term362971.getClass(), "sumTechMasterHighScore", -819290029009314625L);
        setLongField(term362971, term362971.getClass(), "sumTechLunaticHighScore", -4368472154637971545L);
        setLongField(term362971, term362971.getClass(), "sumBattleHighScore", 475270702686004499L);
        setLongField(term362971, term362971.getClass(), "sumBattleBasicHighScore", 8213278854473898483L);
        setLongField(term362971, term362971.getClass(), "sumBattleAdvancedHighScore", 5272791152638756167L);
        setLongField(term362971, term362971.getClass(), "sumBattleExpertHighScore", -1071559115068145878L);
        setLongField(term362971, term362971.getClass(), "sumBattleMasterHighScore", -8641611081812791894L);
        setLongField(term362971, term362971.getClass(), "sumBattleLunaticHighScore", 8723163912604183311L);
        setField(term362971, term362971.getClass(), "eventWatchedDate", "qStzbctyLJ");
        setField(term362971, term362971.getClass(), "cmEventWatchedDate", "DwFOZqjQsc");
        setField(term362971, term362971.getClass(), "firstGameId", "lnaaPhjFrk");
        setField(term362971, term362971.getClass(), "firstRomVersion", "pmrwOMPSht");
        setField(term362971, term362971.getClass(), "firstDataVersion", "INqCuCsEDd");
        setField(term362971, term362971.getClass(), "firstPlayDate", "dUlkhAFong");
        setField(term362971, term362971.getClass(), "lastGameId", "jzmHczvxOi");
        setField(term362971, term362971.getClass(), "lastRomVersion", "xWOzduiVAJ");
        setField(term362971, term362971.getClass(), "lastDataVersion", "WEIfiUKcne");
        setField(term362971, term362971.getClass(), "compatibleCmVersion", "ziUiwLAztn");
        setField(term362971, term362971.getClass(), "lastPlayDate", "vHbDlHjnmH");
        setIntField(term362971, term362971.getClass(), "lastPlaceId", 1070113142);
        setField(term362971, term362971.getClass(), "lastPlaceName", "PXyqSkkwbT");
        setIntField(term362971, term362971.getClass(), "lastRegionId", -882091813);
        setField(term362971, term362971.getClass(), "lastRegionName", "dtCvEKxkmc");
        setIntField(term362971, term362971.getClass(), "lastAllNetId", 312477385);
        setField(term362971, term362971.getClass(), "lastClientId", "kYWWIZVVxi");
        setIntField(term362971, term362971.getClass(), "lastUsedDeckId", -1414947205);
        setIntField(term362971, term362971.getClass(), "lastPlayMusicLevel", 237337013);
        setIntField(term362971, term362971.getClass(), "lastEmoneyBrand", 1582474044);
        setField(term362969, term362969.getClass(), "user", term362971);
        setIntField(term362969, term362969.getClass(), "levelId", -2003404965);
        setIntField(term362969, term362969.getClass(), "allBreakCount", 1762321217);
        setIntField(term362969, term362969.getClass(), "allBreakPlusCount", -1068688513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelId", argTypes, term362969, args);
    }

};


