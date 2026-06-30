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

public class UserUdemae_getNpcTotalLoseNum_46002667814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102555;

    public UserUdemae_getNpcTotalLoseNum_46002667814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102561 = new Long(4266570509071948633L);
        ArrayList term102622 = new ArrayList();
        Integer term102628 = new Integer(-1440013173);
        Integer term102630 = new Integer(-288126597);
        Integer term102632 = new Integer(-218831961);
        Integer term102634 = new Integer(826765055);
        Integer term102636 = new Integer(1358117317);
        Integer term102638 = new Integer(229989439);
        Integer term102640 = new Integer(-1620126913);
        ArrayList term102626 = new ArrayList();
        ((ArrayList) term102626).add(term102628);
        ((ArrayList) term102626).add(term102630);
        ((ArrayList) term102626).add(term102632);
        ((ArrayList) term102626).add(term102634);
        ((ArrayList) term102626).add(term102636);
        ((ArrayList) term102626).add(term102638);
        ((ArrayList) term102626).add(term102640);
        term102555 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term102557 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term102559 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102580 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102590 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102555, term102555.getClass(), "id", -3557828826380506985L);
        setLongField(term102557, term102557.getClass(), "id", 4558042198021968417L);
        setLongField(term102559, term102559.getClass(), "id", 382895385605219775L);
        setField(term102559, term102559.getClass(), "extId", term102561);
        setField(term102559, term102559.getClass(), "luid", "sNNylQpAva");
        setIntField(term102576, term102576.getClass(), "year", 2015);
        setShortField(term102576, term102576.getClass(), "month", (short) 4);
        setShortField(term102576, term102576.getClass(), "day", (short) 14);
        setField(term102575, term102575.getClass(), "date", term102576);
        setByteField(term102580, term102580.getClass(), "hour", (byte) 23);
        setByteField(term102580, term102580.getClass(), "minute", (byte) 8);
        setByteField(term102580, term102580.getClass(), "second", (byte) 53);
        setIntField(term102580, term102580.getClass(), "nano", 375234559);
        setField(term102575, term102575.getClass(), "time", term102580);
        setField(term102559, term102559.getClass(), "registerTime", term102575);
        setIntField(term102586, term102586.getClass(), "year", 2018);
        setShortField(term102586, term102586.getClass(), "month", (short) 1);
        setShortField(term102586, term102586.getClass(), "day", (short) 29);
        setField(term102585, term102585.getClass(), "date", term102586);
        setByteField(term102590, term102590.getClass(), "hour", (byte) 17);
        setByteField(term102590, term102590.getClass(), "minute", (byte) 5);
        setByteField(term102590, term102590.getClass(), "second", (byte) 53);
        setIntField(term102590, term102590.getClass(), "nano", 36624440);
        setField(term102585, term102585.getClass(), "time", term102590);
        setField(term102559, term102559.getClass(), "accessTime", term102585);
        setField(term102557, term102557.getClass(), "card", term102559);
        setField(term102557, term102557.getClass(), "userName", "fiwockBanw");
        setIntField(term102557, term102557.getClass(), "isNetMember", -875891947);
        setIntField(term102557, term102557.getClass(), "iconId", 1496553034);
        setIntField(term102557, term102557.getClass(), "plateId", 272546912);
        setIntField(term102557, term102557.getClass(), "titleId", -1534845297);
        setIntField(term102557, term102557.getClass(), "partnerId", 1159214599);
        setIntField(term102557, term102557.getClass(), "frameId", 2063913776);
        setIntField(term102557, term102557.getClass(), "selectMapId", -167719421);
        setIntField(term102557, term102557.getClass(), "totalAwake", 1185474565);
        setIntField(term102557, term102557.getClass(), "gradeRating", -1081016436);
        setIntField(term102557, term102557.getClass(), "musicRating", 1465385986);
        setIntField(term102557, term102557.getClass(), "playerRating", 1976158913);
        setIntField(term102557, term102557.getClass(), "highestRating", 696093985);
        setIntField(term102557, term102557.getClass(), "gradeRank", 488572556);
        setIntField(term102557, term102557.getClass(), "classRank", 2103579931);
        setIntField(term102557, term102557.getClass(), "courseRank", -363708885);
        setField(term102557, term102557.getClass(), "charaSlot", term102622);
        setField(term102557, term102557.getClass(), "charaLockSlot", term102626);
        setLongField(term102557, term102557.getClass(), "contentBit", -3755777817165703863L);
        setIntField(term102557, term102557.getClass(), "playCount", -1777069422);
        setField(term102557, term102557.getClass(), "eventWatchedDate", "VbcximgVTz");
        setField(term102557, term102557.getClass(), "lastGameId", "TGJZvuTmTU");
        setField(term102557, term102557.getClass(), "lastRomVersion", "BSkkjeLezA");
        setField(term102557, term102557.getClass(), "lastDataVersion", "uAlTVusgen");
        setField(term102557, term102557.getClass(), "lastLoginDate", "PAUaymMOSJ");
        setField(term102557, term102557.getClass(), "lastPlayDate", "OcTjqWhWJS");
        setIntField(term102557, term102557.getClass(), "lastPlayCredit", 1328193739);
        setIntField(term102557, term102557.getClass(), "lastPlayMode", 1769168524);
        setIntField(term102557, term102557.getClass(), "lastPlaceId", 527335694);
        setField(term102557, term102557.getClass(), "lastPlaceName", "XkidVezikV");
        setIntField(term102557, term102557.getClass(), "lastAllNetId", 1217049721);
        setIntField(term102557, term102557.getClass(), "lastRegionId", 843041661);
        setField(term102557, term102557.getClass(), "lastRegionName", "xSsMPNRSUV");
        setField(term102557, term102557.getClass(), "lastClientId", "DRbcFFNcSr");
        setField(term102557, term102557.getClass(), "lastCountryCode", "WGDSInQrVz");
        setIntField(term102557, term102557.getClass(), "lastSelectEMoney", -1872674019);
        setIntField(term102557, term102557.getClass(), "lastSelectTicket", 580191788);
        setIntField(term102557, term102557.getClass(), "lastSelectCourse", -1340848376);
        setIntField(term102557, term102557.getClass(), "lastCountCourse", -1482512097);
        setField(term102557, term102557.getClass(), "firstGameId", "pJboxLnvbb");
        setField(term102557, term102557.getClass(), "firstRomVersion", "ofGdinTYHj");
        setField(term102557, term102557.getClass(), "firstDataVersion", "FaJjdWrmzf");
        setField(term102557, term102557.getClass(), "firstPlayDate", "qBRgIZjugc");
        setField(term102557, term102557.getClass(), "compatibleCmVersion", "ZPnUGVLyiF");
        setField(term102557, term102557.getClass(), "dailyBonusDate", "iGWKoojIzf");
        setField(term102557, term102557.getClass(), "dailyCourseBonusDate", "hBwCfmunWp");
        setField(term102557, term102557.getClass(), "lastPairLoginDate", "dEmUNxEaGp");
        setField(term102557, term102557.getClass(), "lastTrialPlayDate", "FiihXkdDjE");
        setIntField(term102557, term102557.getClass(), "playVsCount", -2076427376);
        setIntField(term102557, term102557.getClass(), "playSyncCount", -852476369);
        setIntField(term102557, term102557.getClass(), "winCount", 596868453);
        setIntField(term102557, term102557.getClass(), "helpCount", -1890744188);
        setIntField(term102557, term102557.getClass(), "comboCount", 2118439468);
        setLongField(term102557, term102557.getClass(), "totalDeluxscore", 9156245454040127967L);
        setLongField(term102557, term102557.getClass(), "totalBasicDeluxscore", 5212155851024918908L);
        setLongField(term102557, term102557.getClass(), "totalAdvancedDeluxscore", -8581554708993911028L);
        setLongField(term102557, term102557.getClass(), "totalExpertDeluxscore", 6886004116842500611L);
        setLongField(term102557, term102557.getClass(), "totalMasterDeluxscore", 5558244994938325139L);
        setLongField(term102557, term102557.getClass(), "totalReMasterDeluxscore", 7731755337784936423L);
        setIntField(term102557, term102557.getClass(), "totalSync", -241809702);
        setIntField(term102557, term102557.getClass(), "totalBasicSync", 711539411);
        setIntField(term102557, term102557.getClass(), "totalAdvancedSync", 702531885);
        setIntField(term102557, term102557.getClass(), "totalExpertSync", 137777785);
        setIntField(term102557, term102557.getClass(), "totalMasterSync", -1972381311);
        setIntField(term102557, term102557.getClass(), "totalReMasterSync", -1871425005);
        setLongField(term102557, term102557.getClass(), "totalAchievement", -1374127091272456168L);
        setLongField(term102557, term102557.getClass(), "totalBasicAchievement", 9130044369997098420L);
        setLongField(term102557, term102557.getClass(), "totalAdvancedAchievement", 7290022068563009794L);
        setLongField(term102557, term102557.getClass(), "totalExpertAchievement", 2323440960270760830L);
        setLongField(term102557, term102557.getClass(), "totalMasterAchievement", 4533583496836744726L);
        setLongField(term102557, term102557.getClass(), "totalReMasterAchievement", 2414597052032100136L);
        setLongField(term102557, term102557.getClass(), "playerOldRating", -1963815850972856990L);
        setLongField(term102557, term102557.getClass(), "playerNewRating", 6662149042039246051L);
        setIntField(term102557, term102557.getClass(), "banState", -1968820002);
        setLongField(term102557, term102557.getClass(), "dateTime", -4813337266375113125L);
        setField(term102555, term102555.getClass(), "user", term102557);
        setIntField(term102555, term102555.getClass(), "rate", 1126576455);
        setIntField(term102555, term102555.getClass(), "maxRate", -84202309);
        setIntField(term102555, term102555.getClass(), "classValue", 54744840);
        setIntField(term102555, term102555.getClass(), "maxClassValue", -1017477523);
        setIntField(term102555, term102555.getClass(), "totalWinNum", 1084453109);
        setIntField(term102555, term102555.getClass(), "totalLoseNum", -1674658475);
        setIntField(term102555, term102555.getClass(), "maxWinNum", 1130325657);
        setIntField(term102555, term102555.getClass(), "maxLoseNum", 247563740);
        setIntField(term102555, term102555.getClass(), "winNum", 1806796271);
        setIntField(term102555, term102555.getClass(), "loseNum", -91540855);
        setIntField(term102555, term102555.getClass(), "npcTotalWinNum", -2120152870);
        setIntField(term102555, term102555.getClass(), "npcTotalLoseNum", -2111077974);
        setIntField(term102555, term102555.getClass(), "npcMaxWinNum", 1055817592);
        setIntField(term102555, term102555.getClass(), "npcMaxLoseNum", 967496047);
        setIntField(term102555, term102555.getClass(), "npcWinNum", -1410428562);
        setIntField(term102555, term102555.getClass(), "npcLoseNum", 1498236261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcTotalLoseNum", argTypes, term102555, args);
    }

};


