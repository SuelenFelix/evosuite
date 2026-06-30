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

public class UserItem_getId_4718415771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33484;

    public UserItem_getId_4718415771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33490 = new Long(-3842548265506930260L);
        Integer term33553 = new Integer(-1455526612);
        Integer term33555 = new Integer(-941356098);
        Integer term33557 = new Integer(-201517446);
        Integer term33559 = new Integer(-97742366);
        Integer term33561 = new Integer(1638851942);
        Integer term33563 = new Integer(1374790203);
        Integer term33565 = new Integer(1160010161);
        ArrayList term33551 = new ArrayList();
        ((ArrayList) term33551).add(term33553);
        ((ArrayList) term33551).add(term33555);
        ((ArrayList) term33551).add(term33557);
        ((ArrayList) term33551).add(term33559);
        ((ArrayList) term33551).add(term33561);
        ((ArrayList) term33551).add(term33563);
        ((ArrayList) term33551).add(term33565);
        Integer term33571 = new Integer(-423900705);
        Integer term33573 = new Integer(-525570815);
        ArrayList term33569 = new ArrayList();
        ((ArrayList) term33569).add(term33571);
        ((ArrayList) term33569).add(term33573);
        term33484 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term33486 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term33488 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33509 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33519 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33484, term33484.getClass(), "id", -2746162973618820048L);
        setLongField(term33486, term33486.getClass(), "id", -5466267958566655205L);
        setLongField(term33488, term33488.getClass(), "id", 4066162530086558234L);
        setField(term33488, term33488.getClass(), "extId", term33490);
        setField(term33488, term33488.getClass(), "luid", "BdsLFSRWda");
        setIntField(term33505, term33505.getClass(), "year", 2019);
        setShortField(term33505, term33505.getClass(), "month", (short) 8);
        setShortField(term33505, term33505.getClass(), "day", (short) 12);
        setField(term33504, term33504.getClass(), "date", term33505);
        setByteField(term33509, term33509.getClass(), "hour", (byte) 14);
        setByteField(term33509, term33509.getClass(), "minute", (byte) 1);
        setByteField(term33509, term33509.getClass(), "second", (byte) 51);
        setIntField(term33509, term33509.getClass(), "nano", 499021786);
        setField(term33504, term33504.getClass(), "time", term33509);
        setField(term33488, term33488.getClass(), "registerTime", term33504);
        setIntField(term33515, term33515.getClass(), "year", 2014);
        setShortField(term33515, term33515.getClass(), "month", (short) 7);
        setShortField(term33515, term33515.getClass(), "day", (short) 22);
        setField(term33514, term33514.getClass(), "date", term33515);
        setByteField(term33519, term33519.getClass(), "hour", (byte) 9);
        setByteField(term33519, term33519.getClass(), "minute", (byte) 40);
        setByteField(term33519, term33519.getClass(), "second", (byte) 34);
        setIntField(term33519, term33519.getClass(), "nano", 463008257);
        setField(term33514, term33514.getClass(), "time", term33519);
        setField(term33488, term33488.getClass(), "accessTime", term33514);
        setField(term33486, term33486.getClass(), "card", term33488);
        setField(term33486, term33486.getClass(), "userName", "tMhhBYonAI");
        setIntField(term33486, term33486.getClass(), "isNetMember", 227321148);
        setIntField(term33486, term33486.getClass(), "iconId", -266870537);
        setIntField(term33486, term33486.getClass(), "plateId", -453010858);
        setIntField(term33486, term33486.getClass(), "titleId", -1855427206);
        setIntField(term33486, term33486.getClass(), "partnerId", -647618746);
        setIntField(term33486, term33486.getClass(), "frameId", -91129577);
        setIntField(term33486, term33486.getClass(), "selectMapId", 1629059877);
        setIntField(term33486, term33486.getClass(), "totalAwake", -649940550);
        setIntField(term33486, term33486.getClass(), "gradeRating", 36785954);
        setIntField(term33486, term33486.getClass(), "musicRating", -907057089);
        setIntField(term33486, term33486.getClass(), "playerRating", -1740998635);
        setIntField(term33486, term33486.getClass(), "highestRating", 183857482);
        setIntField(term33486, term33486.getClass(), "gradeRank", -1845135476);
        setIntField(term33486, term33486.getClass(), "classRank", -811321521);
        setIntField(term33486, term33486.getClass(), "courseRank", 449172516);
        setField(term33486, term33486.getClass(), "charaSlot", term33551);
        setField(term33486, term33486.getClass(), "charaLockSlot", term33569);
        setLongField(term33486, term33486.getClass(), "contentBit", -1519007571673072893L);
        setIntField(term33486, term33486.getClass(), "playCount", -1224535182);
        setField(term33486, term33486.getClass(), "eventWatchedDate", "AaQRshwIQC");
        setField(term33486, term33486.getClass(), "lastGameId", "rHgKCfgCsg");
        setField(term33486, term33486.getClass(), "lastRomVersion", "AWtIUOuutt");
        setField(term33486, term33486.getClass(), "lastDataVersion", "jBgJZpHifl");
        setField(term33486, term33486.getClass(), "lastLoginDate", "azMTTmEXnh");
        setField(term33486, term33486.getClass(), "lastPlayDate", "BjJtxwsIpt");
        setIntField(term33486, term33486.getClass(), "lastPlayCredit", 1181771633);
        setIntField(term33486, term33486.getClass(), "lastPlayMode", -21975974);
        setIntField(term33486, term33486.getClass(), "lastPlaceId", -862969915);
        setField(term33486, term33486.getClass(), "lastPlaceName", "gUQhOyGfzF");
        setIntField(term33486, term33486.getClass(), "lastAllNetId", -1289681614);
        setIntField(term33486, term33486.getClass(), "lastRegionId", 496461454);
        setField(term33486, term33486.getClass(), "lastRegionName", "IqDObvPBZX");
        setField(term33486, term33486.getClass(), "lastClientId", "NITCrIISoC");
        setField(term33486, term33486.getClass(), "lastCountryCode", "nSzzeexTDI");
        setIntField(term33486, term33486.getClass(), "lastSelectEMoney", -697047947);
        setIntField(term33486, term33486.getClass(), "lastSelectTicket", 505327656);
        setIntField(term33486, term33486.getClass(), "lastSelectCourse", 1779734830);
        setIntField(term33486, term33486.getClass(), "lastCountCourse", -714618793);
        setField(term33486, term33486.getClass(), "firstGameId", "WBrpvMhmsz");
        setField(term33486, term33486.getClass(), "firstRomVersion", "ZzqRHVEXcM");
        setField(term33486, term33486.getClass(), "firstDataVersion", "YYwIEARNxi");
        setField(term33486, term33486.getClass(), "firstPlayDate", "rblXBUdTFc");
        setField(term33486, term33486.getClass(), "compatibleCmVersion", "rbsXSOJFKW");
        setField(term33486, term33486.getClass(), "dailyBonusDate", "sAgGDoUNlf");
        setField(term33486, term33486.getClass(), "dailyCourseBonusDate", "TSTZcXdFFi");
        setField(term33486, term33486.getClass(), "lastPairLoginDate", "RyaaOzWfYO");
        setField(term33486, term33486.getClass(), "lastTrialPlayDate", "HAkxFBZZzz");
        setIntField(term33486, term33486.getClass(), "playVsCount", 1350743761);
        setIntField(term33486, term33486.getClass(), "playSyncCount", -2100246850);
        setIntField(term33486, term33486.getClass(), "winCount", 174682854);
        setIntField(term33486, term33486.getClass(), "helpCount", -1618786023);
        setIntField(term33486, term33486.getClass(), "comboCount", -316033780);
        setLongField(term33486, term33486.getClass(), "totalDeluxscore", -2965107112757796135L);
        setLongField(term33486, term33486.getClass(), "totalBasicDeluxscore", 8628710602325472259L);
        setLongField(term33486, term33486.getClass(), "totalAdvancedDeluxscore", -6397802456253967096L);
        setLongField(term33486, term33486.getClass(), "totalExpertDeluxscore", -5097855288490086692L);
        setLongField(term33486, term33486.getClass(), "totalMasterDeluxscore", -8356953418230835643L);
        setLongField(term33486, term33486.getClass(), "totalReMasterDeluxscore", -2213998544405629464L);
        setIntField(term33486, term33486.getClass(), "totalSync", -1242223364);
        setIntField(term33486, term33486.getClass(), "totalBasicSync", -347672279);
        setIntField(term33486, term33486.getClass(), "totalAdvancedSync", -2001561246);
        setIntField(term33486, term33486.getClass(), "totalExpertSync", -526492477);
        setIntField(term33486, term33486.getClass(), "totalMasterSync", 934758494);
        setIntField(term33486, term33486.getClass(), "totalReMasterSync", -1458746421);
        setLongField(term33486, term33486.getClass(), "totalAchievement", 226516165063797489L);
        setLongField(term33486, term33486.getClass(), "totalBasicAchievement", -5055043026089632641L);
        setLongField(term33486, term33486.getClass(), "totalAdvancedAchievement", -3602145915631274444L);
        setLongField(term33486, term33486.getClass(), "totalExpertAchievement", 1978286377020745883L);
        setLongField(term33486, term33486.getClass(), "totalMasterAchievement", 2957284484642534979L);
        setLongField(term33486, term33486.getClass(), "totalReMasterAchievement", -4645802432501468482L);
        setLongField(term33486, term33486.getClass(), "playerOldRating", 797348855178248421L);
        setLongField(term33486, term33486.getClass(), "playerNewRating", 4140938707845767186L);
        setIntField(term33486, term33486.getClass(), "banState", 1248508832);
        setLongField(term33486, term33486.getClass(), "dateTime", -6049958218605558734L);
        setField(term33484, term33484.getClass(), "user", term33486);
        setIntField(term33484, term33484.getClass(), "itemKind", -1508290965);
        setIntField(term33484, term33484.getClass(), "itemId", -537204050);
        setIntField(term33484, term33484.getClass(), "stock", 549083285);
        setBooleanField(term33484, term33484.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term33484, args);
    }

};


