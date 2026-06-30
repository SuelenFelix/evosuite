package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCourse_setPlayCount_185828197122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85901;
     Object term86318;

    public UserCourse_setPlayCount_185828197122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85907 = new Long(-1616722610139554082L);
        Integer term85970 = new Integer(2108571355);
        Integer term85972 = new Integer(1909966089);
        Integer term85974 = new Integer(1827255916);
        Integer term85976 = new Integer(2039815750);
        Integer term85978 = new Integer(2079590265);
        Integer term85980 = new Integer(-435079567);
        Integer term85982 = new Integer(-1017617829);
        Integer term85984 = new Integer(270928865);
        ArrayList term85968 = new ArrayList();
        ((ArrayList) term85968).add(term85970);
        ((ArrayList) term85968).add(term85972);
        ((ArrayList) term85968).add(term85974);
        ((ArrayList) term85968).add(term85976);
        ((ArrayList) term85968).add(term85978);
        ((ArrayList) term85968).add(term85980);
        ((ArrayList) term85968).add(term85982);
        ((ArrayList) term85968).add(term85984);
        Integer term85990 = new Integer(-308526089);
        Integer term85992 = new Integer(-359675864);
        ArrayList term85988 = new ArrayList();
        ((ArrayList) term85988).add(term85990);
        ((ArrayList) term85988).add(term85992);
        term85901 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term85903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term85905 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85936 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85901, term85901.getClass(), "id", 2488466015930515496L);
        setLongField(term85903, term85903.getClass(), "id", -937505178592782760L);
        setLongField(term85905, term85905.getClass(), "id", 1129741221881232004L);
        setField(term85905, term85905.getClass(), "extId", term85907);
        setField(term85905, term85905.getClass(), "luid", "BczZfNSwaD");
        setIntField(term85922, term85922.getClass(), "year", 2022);
        setShortField(term85922, term85922.getClass(), "month", (short) 8);
        setShortField(term85922, term85922.getClass(), "day", (short) 16);
        setField(term85921, term85921.getClass(), "date", term85922);
        setByteField(term85926, term85926.getClass(), "hour", (byte) 4);
        setByteField(term85926, term85926.getClass(), "minute", (byte) 38);
        setByteField(term85926, term85926.getClass(), "second", (byte) 51);
        setIntField(term85926, term85926.getClass(), "nano", 348952212);
        setField(term85921, term85921.getClass(), "time", term85926);
        setField(term85905, term85905.getClass(), "registerTime", term85921);
        setIntField(term85932, term85932.getClass(), "year", 2016);
        setShortField(term85932, term85932.getClass(), "month", (short) 7);
        setShortField(term85932, term85932.getClass(), "day", (short) 21);
        setField(term85931, term85931.getClass(), "date", term85932);
        setByteField(term85936, term85936.getClass(), "hour", (byte) 22);
        setByteField(term85936, term85936.getClass(), "minute", (byte) 2);
        setByteField(term85936, term85936.getClass(), "second", (byte) 21);
        setIntField(term85936, term85936.getClass(), "nano", 729266668);
        setField(term85931, term85931.getClass(), "time", term85936);
        setField(term85905, term85905.getClass(), "accessTime", term85931);
        setField(term85903, term85903.getClass(), "card", term85905);
        setField(term85903, term85903.getClass(), "userName", "UqBrzYVNgu");
        setIntField(term85903, term85903.getClass(), "isNetMember", -489193282);
        setIntField(term85903, term85903.getClass(), "iconId", 1790125855);
        setIntField(term85903, term85903.getClass(), "plateId", 665331267);
        setIntField(term85903, term85903.getClass(), "titleId", -2014999682);
        setIntField(term85903, term85903.getClass(), "partnerId", 1982258261);
        setIntField(term85903, term85903.getClass(), "frameId", -1489112012);
        setIntField(term85903, term85903.getClass(), "selectMapId", -723107224);
        setIntField(term85903, term85903.getClass(), "totalAwake", 304541875);
        setIntField(term85903, term85903.getClass(), "gradeRating", -1638286616);
        setIntField(term85903, term85903.getClass(), "musicRating", -256866404);
        setIntField(term85903, term85903.getClass(), "playerRating", -354956895);
        setIntField(term85903, term85903.getClass(), "highestRating", 1889003786);
        setIntField(term85903, term85903.getClass(), "gradeRank", 452911848);
        setIntField(term85903, term85903.getClass(), "classRank", 2003994890);
        setIntField(term85903, term85903.getClass(), "courseRank", 2135032815);
        setField(term85903, term85903.getClass(), "charaSlot", term85968);
        setField(term85903, term85903.getClass(), "charaLockSlot", term85988);
        setLongField(term85903, term85903.getClass(), "contentBit", -9102400273331433507L);
        setIntField(term85903, term85903.getClass(), "playCount", 2102441611);
        setField(term85903, term85903.getClass(), "eventWatchedDate", "yETjenqbhE");
        setField(term85903, term85903.getClass(), "lastGameId", "XzpzIeoooh");
        setField(term85903, term85903.getClass(), "lastRomVersion", "sbsbTdToVA");
        setField(term85903, term85903.getClass(), "lastDataVersion", "PTMnmtfPDP");
        setField(term85903, term85903.getClass(), "lastLoginDate", "POLJqDqHhk");
        setField(term85903, term85903.getClass(), "lastPlayDate", "eXlhmImRUd");
        setIntField(term85903, term85903.getClass(), "lastPlayCredit", -972921113);
        setIntField(term85903, term85903.getClass(), "lastPlayMode", -1692479417);
        setIntField(term85903, term85903.getClass(), "lastPlaceId", -1090532898);
        setField(term85903, term85903.getClass(), "lastPlaceName", "pNjJQBsfBv");
        setIntField(term85903, term85903.getClass(), "lastAllNetId", 1732323444);
        setIntField(term85903, term85903.getClass(), "lastRegionId", -1704583810);
        setField(term85903, term85903.getClass(), "lastRegionName", "AeoFWTVnXE");
        setField(term85903, term85903.getClass(), "lastClientId", "KNodpPTOen");
        setField(term85903, term85903.getClass(), "lastCountryCode", "HLdVSdPKUm");
        setIntField(term85903, term85903.getClass(), "lastSelectEMoney", -1057666750);
        setIntField(term85903, term85903.getClass(), "lastSelectTicket", 702126350);
        setIntField(term85903, term85903.getClass(), "lastSelectCourse", -1320161427);
        setIntField(term85903, term85903.getClass(), "lastCountCourse", 841954160);
        setField(term85903, term85903.getClass(), "firstGameId", "cKqYMrtneQ");
        setField(term85903, term85903.getClass(), "firstRomVersion", "CgvYDHvQnF");
        setField(term85903, term85903.getClass(), "firstDataVersion", "wzvrwvpSgi");
        setField(term85903, term85903.getClass(), "firstPlayDate", "qwrZBRPuHr");
        setField(term85903, term85903.getClass(), "compatibleCmVersion", "ZlmkgzeZIu");
        setField(term85903, term85903.getClass(), "dailyBonusDate", "SFuBQQfwki");
        setField(term85903, term85903.getClass(), "dailyCourseBonusDate", "ryTUTfVgWx");
        setField(term85903, term85903.getClass(), "lastPairLoginDate", "ImdGsYOHJc");
        setField(term85903, term85903.getClass(), "lastTrialPlayDate", "MBkxidzets");
        setIntField(term85903, term85903.getClass(), "playVsCount", 1417577834);
        setIntField(term85903, term85903.getClass(), "playSyncCount", -1641288466);
        setIntField(term85903, term85903.getClass(), "winCount", 1755218175);
        setIntField(term85903, term85903.getClass(), "helpCount", 647511055);
        setIntField(term85903, term85903.getClass(), "comboCount", -1949921728);
        setLongField(term85903, term85903.getClass(), "totalDeluxscore", -7603034666961874453L);
        setLongField(term85903, term85903.getClass(), "totalBasicDeluxscore", 6171188519299774487L);
        setLongField(term85903, term85903.getClass(), "totalAdvancedDeluxscore", 8409252889039339447L);
        setLongField(term85903, term85903.getClass(), "totalExpertDeluxscore", 6113018989695983183L);
        setLongField(term85903, term85903.getClass(), "totalMasterDeluxscore", 7008972996434680296L);
        setLongField(term85903, term85903.getClass(), "totalReMasterDeluxscore", 678000773176130475L);
        setIntField(term85903, term85903.getClass(), "totalSync", 932437963);
        setIntField(term85903, term85903.getClass(), "totalBasicSync", -194822585);
        setIntField(term85903, term85903.getClass(), "totalAdvancedSync", 1420387294);
        setIntField(term85903, term85903.getClass(), "totalExpertSync", 1088015655);
        setIntField(term85903, term85903.getClass(), "totalMasterSync", -1328130039);
        setIntField(term85903, term85903.getClass(), "totalReMasterSync", 716362214);
        setLongField(term85903, term85903.getClass(), "totalAchievement", -1750640202321719004L);
        setLongField(term85903, term85903.getClass(), "totalBasicAchievement", -5655330187112396076L);
        setLongField(term85903, term85903.getClass(), "totalAdvancedAchievement", 6764238104675879678L);
        setLongField(term85903, term85903.getClass(), "totalExpertAchievement", 3263003405250803159L);
        setLongField(term85903, term85903.getClass(), "totalMasterAchievement", 7457643343142968442L);
        setLongField(term85903, term85903.getClass(), "totalReMasterAchievement", -1467781323351622064L);
        setLongField(term85903, term85903.getClass(), "playerOldRating", -5585704080249558832L);
        setLongField(term85903, term85903.getClass(), "playerNewRating", 4016618299857011653L);
        setIntField(term85903, term85903.getClass(), "banState", -699487881);
        setLongField(term85903, term85903.getClass(), "dateTime", -8830414189681727376L);
        setField(term85901, term85901.getClass(), "user", term85903);
        setIntField(term85901, term85901.getClass(), "courseId", 562568318);
        setBooleanField(term85901, term85901.getClass(), "isLastClear", true);
        setIntField(term85901, term85901.getClass(), "totalRestlife", 297158063);
        setIntField(term85901, term85901.getClass(), "totalAchievement", -38995653);
        setIntField(term85901, term85901.getClass(), "totalDeluxscore", -1893842770);
        setIntField(term85901, term85901.getClass(), "playCount", 2048873968);
        setField(term85901, term85901.getClass(), "clearDate", "PbMQbuzByL");
        setField(term85901, term85901.getClass(), "lastPlayDate", "ILplPJhYrB");
        setIntField(term85901, term85901.getClass(), "bestAchievement", -1447906264);
        setField(term85901, term85901.getClass(), "bestAchievementDate", "ZLOixiOrLS");
        setIntField(term85901, term85901.getClass(), "bestDeluxscore", 1527786708);
        setField(term85901, term85901.getClass(), "bestDeluxscoreDate", "jyRmrZMyEy");
        term86318 = new Integer(-360741897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term86318;
        callMethod(klass, "setPlayCount", argTypes, term85901, args);
    }

};


