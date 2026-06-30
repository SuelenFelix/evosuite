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

public class UserExtend_getSortCategorySetting_169594893113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149119;

    public UserExtend_getSortCategorySetting_169594893113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149125 = new Long(-7406618974062419277L);
        Integer term149188 = new Integer(-2139205197);
        Integer term149190 = new Integer(-584949216);
        Integer term149192 = new Integer(1646064199);
        Integer term149194 = new Integer(-1135845415);
        Integer term149196 = new Integer(-1361921586);
        Integer term149198 = new Integer(593679468);
        Integer term149200 = new Integer(747491);
        Integer term149202 = new Integer(734222768);
        Integer term149204 = new Integer(1545425140);
        ArrayList term149186 = new ArrayList();
        ((ArrayList) term149186).add(term149188);
        ((ArrayList) term149186).add(term149190);
        ((ArrayList) term149186).add(term149192);
        ((ArrayList) term149186).add(term149194);
        ((ArrayList) term149186).add(term149196);
        ((ArrayList) term149186).add(term149198);
        ((ArrayList) term149186).add(term149200);
        ((ArrayList) term149186).add(term149202);
        ((ArrayList) term149186).add(term149204);
        Integer term149210 = new Integer(-1580765555);
        Integer term149212 = new Integer(-1295149055);
        ArrayList term149208 = new ArrayList();
        ((ArrayList) term149208).add(term149210);
        ((ArrayList) term149208).add(term149212);
        Integer term149496 = new Integer(-769814321);
        Integer term149498 = new Integer(114898432);
        ArrayList term149494 = new ArrayList();
        ((ArrayList) term149494).add(term149496);
        ((ArrayList) term149494).add(term149498);
        ArrayList term149502 = new ArrayList();
        term149119 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term149121 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term149123 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149154 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149119, term149119.getClass(), "id", 5000934326886384107L);
        setLongField(term149121, term149121.getClass(), "id", -4297212176638829440L);
        setLongField(term149123, term149123.getClass(), "id", 8215651910912029934L);
        setField(term149123, term149123.getClass(), "extId", term149125);
        setField(term149123, term149123.getClass(), "luid", "EZlpBOXfGZ");
        setIntField(term149140, term149140.getClass(), "year", 2027);
        setShortField(term149140, term149140.getClass(), "month", (short) 1);
        setShortField(term149140, term149140.getClass(), "day", (short) 10);
        setField(term149139, term149139.getClass(), "date", term149140);
        setByteField(term149144, term149144.getClass(), "hour", (byte) 8);
        setByteField(term149144, term149144.getClass(), "minute", (byte) 34);
        setByteField(term149144, term149144.getClass(), "second", (byte) 28);
        setIntField(term149144, term149144.getClass(), "nano", 703673031);
        setField(term149139, term149139.getClass(), "time", term149144);
        setField(term149123, term149123.getClass(), "registerTime", term149139);
        setIntField(term149150, term149150.getClass(), "year", 2014);
        setShortField(term149150, term149150.getClass(), "month", (short) 5);
        setShortField(term149150, term149150.getClass(), "day", (short) 30);
        setField(term149149, term149149.getClass(), "date", term149150);
        setByteField(term149154, term149154.getClass(), "hour", (byte) 10);
        setByteField(term149154, term149154.getClass(), "minute", (byte) 34);
        setByteField(term149154, term149154.getClass(), "second", (byte) 17);
        setIntField(term149154, term149154.getClass(), "nano", 917654429);
        setField(term149149, term149149.getClass(), "time", term149154);
        setField(term149123, term149123.getClass(), "accessTime", term149149);
        setField(term149121, term149121.getClass(), "card", term149123);
        setField(term149121, term149121.getClass(), "userName", "XkQUchkoze");
        setIntField(term149121, term149121.getClass(), "isNetMember", 1543999925);
        setIntField(term149121, term149121.getClass(), "iconId", -1587400954);
        setIntField(term149121, term149121.getClass(), "plateId", 822645894);
        setIntField(term149121, term149121.getClass(), "titleId", -1570295297);
        setIntField(term149121, term149121.getClass(), "partnerId", 823152755);
        setIntField(term149121, term149121.getClass(), "frameId", 929229690);
        setIntField(term149121, term149121.getClass(), "selectMapId", -454507797);
        setIntField(term149121, term149121.getClass(), "totalAwake", 304461972);
        setIntField(term149121, term149121.getClass(), "gradeRating", 907796752);
        setIntField(term149121, term149121.getClass(), "musicRating", -1758084707);
        setIntField(term149121, term149121.getClass(), "playerRating", -1982548161);
        setIntField(term149121, term149121.getClass(), "highestRating", 1329279958);
        setIntField(term149121, term149121.getClass(), "gradeRank", 469543205);
        setIntField(term149121, term149121.getClass(), "classRank", -12516056);
        setIntField(term149121, term149121.getClass(), "courseRank", 1697090986);
        setField(term149121, term149121.getClass(), "charaSlot", term149186);
        setField(term149121, term149121.getClass(), "charaLockSlot", term149208);
        setLongField(term149121, term149121.getClass(), "contentBit", -3920613380913851875L);
        setIntField(term149121, term149121.getClass(), "playCount", -1830375526);
        setField(term149121, term149121.getClass(), "eventWatchedDate", "xHufEneCSu");
        setField(term149121, term149121.getClass(), "lastGameId", "dcNBqbQVSa");
        setField(term149121, term149121.getClass(), "lastRomVersion", "voFZMRWdRg");
        setField(term149121, term149121.getClass(), "lastDataVersion", "xUCRGyGVPj");
        setField(term149121, term149121.getClass(), "lastLoginDate", "mODhKHNihX");
        setField(term149121, term149121.getClass(), "lastPlayDate", "JuAcOfOxNL");
        setIntField(term149121, term149121.getClass(), "lastPlayCredit", 936265526);
        setIntField(term149121, term149121.getClass(), "lastPlayMode", -495686058);
        setIntField(term149121, term149121.getClass(), "lastPlaceId", 611713058);
        setField(term149121, term149121.getClass(), "lastPlaceName", "XaqYbQZIGI");
        setIntField(term149121, term149121.getClass(), "lastAllNetId", -1354326923);
        setIntField(term149121, term149121.getClass(), "lastRegionId", -986698677);
        setField(term149121, term149121.getClass(), "lastRegionName", "grTooFWhNl");
        setField(term149121, term149121.getClass(), "lastClientId", "ndJgNFVDzv");
        setField(term149121, term149121.getClass(), "lastCountryCode", "GLSpCLEiGN");
        setIntField(term149121, term149121.getClass(), "lastSelectEMoney", -1381534227);
        setIntField(term149121, term149121.getClass(), "lastSelectTicket", -115921884);
        setIntField(term149121, term149121.getClass(), "lastSelectCourse", 69514589);
        setIntField(term149121, term149121.getClass(), "lastCountCourse", 1016576703);
        setField(term149121, term149121.getClass(), "firstGameId", "JiekpKxKqu");
        setField(term149121, term149121.getClass(), "firstRomVersion", "fZAngeuZqR");
        setField(term149121, term149121.getClass(), "firstDataVersion", "zlkNfxvlVJ");
        setField(term149121, term149121.getClass(), "firstPlayDate", "RWefwvwipX");
        setField(term149121, term149121.getClass(), "compatibleCmVersion", "FXnVCgcJAm");
        setField(term149121, term149121.getClass(), "dailyBonusDate", "noOpWudfzV");
        setField(term149121, term149121.getClass(), "dailyCourseBonusDate", "OWORKBHHIN");
        setField(term149121, term149121.getClass(), "lastPairLoginDate", "sbvPxiaOoC");
        setField(term149121, term149121.getClass(), "lastTrialPlayDate", "rrCIslqAVq");
        setIntField(term149121, term149121.getClass(), "playVsCount", -1816990337);
        setIntField(term149121, term149121.getClass(), "playSyncCount", -729317472);
        setIntField(term149121, term149121.getClass(), "winCount", 518527887);
        setIntField(term149121, term149121.getClass(), "helpCount", 1621425751);
        setIntField(term149121, term149121.getClass(), "comboCount", 1649760237);
        setLongField(term149121, term149121.getClass(), "totalDeluxscore", -440755498557401601L);
        setLongField(term149121, term149121.getClass(), "totalBasicDeluxscore", -5218993020177690425L);
        setLongField(term149121, term149121.getClass(), "totalAdvancedDeluxscore", -5010811251033649416L);
        setLongField(term149121, term149121.getClass(), "totalExpertDeluxscore", -3608698424858065799L);
        setLongField(term149121, term149121.getClass(), "totalMasterDeluxscore", -1824018949914106101L);
        setLongField(term149121, term149121.getClass(), "totalReMasterDeluxscore", -8481652492431239971L);
        setIntField(term149121, term149121.getClass(), "totalSync", 1188626740);
        setIntField(term149121, term149121.getClass(), "totalBasicSync", -114111309);
        setIntField(term149121, term149121.getClass(), "totalAdvancedSync", -2138943082);
        setIntField(term149121, term149121.getClass(), "totalExpertSync", -186268116);
        setIntField(term149121, term149121.getClass(), "totalMasterSync", -2082248803);
        setIntField(term149121, term149121.getClass(), "totalReMasterSync", -1705126082);
        setLongField(term149121, term149121.getClass(), "totalAchievement", 3802850938772527111L);
        setLongField(term149121, term149121.getClass(), "totalBasicAchievement", 6738059813256349238L);
        setLongField(term149121, term149121.getClass(), "totalAdvancedAchievement", -278816731242466343L);
        setLongField(term149121, term149121.getClass(), "totalExpertAchievement", -8659357574528547713L);
        setLongField(term149121, term149121.getClass(), "totalMasterAchievement", 9014585525331582548L);
        setLongField(term149121, term149121.getClass(), "totalReMasterAchievement", -8738722461167485740L);
        setLongField(term149121, term149121.getClass(), "playerOldRating", 6778039702742785844L);
        setLongField(term149121, term149121.getClass(), "playerNewRating", 1384579917116205329L);
        setIntField(term149121, term149121.getClass(), "banState", -720862130);
        setLongField(term149121, term149121.getClass(), "dateTime", 999891730378035296L);
        setField(term149119, term149119.getClass(), "user", term149121);
        setIntField(term149119, term149119.getClass(), "selectMusicId", 1070677067);
        setIntField(term149119, term149119.getClass(), "selectDifficultyId", -2011581334);
        setIntField(term149119, term149119.getClass(), "categoryIndex", 1700393240);
        setIntField(term149119, term149119.getClass(), "musicIndex", -2014947462);
        setIntField(term149119, term149119.getClass(), "extraFlag", -719658316);
        setIntField(term149119, term149119.getClass(), "selectScoreType", 303187441);
        setLongField(term149119, term149119.getClass(), "extendContentBit", 393462815993868728L);
        setBooleanField(term149119, term149119.getClass(), "isPhotoAgree", false);
        setBooleanField(term149119, term149119.getClass(), "isGotoCodeRead", false);
        setBooleanField(term149119, term149119.getClass(), "selectResultDetails", false);
        setIntField(term149119, term149119.getClass(), "sortCategorySetting", -1129294722);
        setIntField(term149119, term149119.getClass(), "sortMusicSetting", -1465687477);
        setField(term149119, term149119.getClass(), "selectedCardList", term149494);
        setField(term149119, term149119.getClass(), "encountMapNpcList", term149502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortCategorySetting", argTypes, term149119, args);
    }

};


