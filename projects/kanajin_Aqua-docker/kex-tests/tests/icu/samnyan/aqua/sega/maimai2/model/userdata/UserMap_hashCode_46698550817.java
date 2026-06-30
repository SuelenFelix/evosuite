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

public class UserMap_hashCode_46698550817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583601;

    public UserMap_hashCode_46698550817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term583607 = new Long(1078204819466025938L);
        Integer term583670 = new Integer(887599888);
        Integer term583672 = new Integer(1751900954);
        Integer term583674 = new Integer(2134772267);
        Integer term583676 = new Integer(-1444419310);
        Integer term583678 = new Integer(1149220041);
        Integer term583680 = new Integer(934382905);
        Integer term583682 = new Integer(-464797117);
        ArrayList term583668 = new ArrayList();
        ((ArrayList) term583668).add(term583670);
        ((ArrayList) term583668).add(term583672);
        ((ArrayList) term583668).add(term583674);
        ((ArrayList) term583668).add(term583676);
        ((ArrayList) term583668).add(term583678);
        ((ArrayList) term583668).add(term583680);
        ((ArrayList) term583668).add(term583682);
        Integer term583688 = new Integer(-1417713070);
        Integer term583690 = new Integer(545747490);
        Integer term583692 = new Integer(-922198860);
        Integer term583694 = new Integer(369166807);
        Integer term583696 = new Integer(568150061);
        Integer term583698 = new Integer(-1014042063);
        Integer term583700 = new Integer(-1581094320);
        Integer term583702 = new Integer(861218402);
        Integer term583704 = new Integer(2041897178);
        ArrayList term583686 = new ArrayList();
        ((ArrayList) term583686).add(term583688);
        ((ArrayList) term583686).add(term583690);
        ((ArrayList) term583686).add(term583692);
        ((ArrayList) term583686).add(term583694);
        ((ArrayList) term583686).add(term583696);
        ((ArrayList) term583686).add(term583698);
        ((ArrayList) term583686).add(term583700);
        ((ArrayList) term583686).add(term583702);
        ((ArrayList) term583686).add(term583704);
        term583601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term583603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term583605 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term583621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term583626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term583631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term583636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term583601, term583601.getClass(), "id", -8962289172527443647L);
        setLongField(term583603, term583603.getClass(), "id", 1353271030300940571L);
        setLongField(term583605, term583605.getClass(), "id", -7418320851061470472L);
        setField(term583605, term583605.getClass(), "extId", term583607);
        setField(term583605, term583605.getClass(), "luid", "hCbFAWPfXB");
        setIntField(term583622, term583622.getClass(), "year", 2023);
        setShortField(term583622, term583622.getClass(), "month", (short) 1);
        setShortField(term583622, term583622.getClass(), "day", (short) 30);
        setField(term583621, term583621.getClass(), "date", term583622);
        setByteField(term583626, term583626.getClass(), "hour", (byte) 7);
        setByteField(term583626, term583626.getClass(), "minute", (byte) 20);
        setByteField(term583626, term583626.getClass(), "second", (byte) 52);
        setIntField(term583626, term583626.getClass(), "nano", 873057592);
        setField(term583621, term583621.getClass(), "time", term583626);
        setField(term583605, term583605.getClass(), "registerTime", term583621);
        setIntField(term583632, term583632.getClass(), "year", 2022);
        setShortField(term583632, term583632.getClass(), "month", (short) 2);
        setShortField(term583632, term583632.getClass(), "day", (short) 21);
        setField(term583631, term583631.getClass(), "date", term583632);
        setByteField(term583636, term583636.getClass(), "hour", (byte) 18);
        setByteField(term583636, term583636.getClass(), "minute", (byte) 30);
        setByteField(term583636, term583636.getClass(), "second", (byte) 42);
        setIntField(term583636, term583636.getClass(), "nano", 404969998);
        setField(term583631, term583631.getClass(), "time", term583636);
        setField(term583605, term583605.getClass(), "accessTime", term583631);
        setField(term583603, term583603.getClass(), "card", term583605);
        setField(term583603, term583603.getClass(), "userName", "CHiNwHAmlf");
        setIntField(term583603, term583603.getClass(), "isNetMember", -881566618);
        setIntField(term583603, term583603.getClass(), "iconId", -919306911);
        setIntField(term583603, term583603.getClass(), "plateId", -1225877031);
        setIntField(term583603, term583603.getClass(), "titleId", 668666929);
        setIntField(term583603, term583603.getClass(), "partnerId", 335712666);
        setIntField(term583603, term583603.getClass(), "frameId", 726266156);
        setIntField(term583603, term583603.getClass(), "selectMapId", 961599159);
        setIntField(term583603, term583603.getClass(), "totalAwake", 1449263288);
        setIntField(term583603, term583603.getClass(), "gradeRating", 1009724984);
        setIntField(term583603, term583603.getClass(), "musicRating", -572624099);
        setIntField(term583603, term583603.getClass(), "playerRating", -276154963);
        setIntField(term583603, term583603.getClass(), "highestRating", -374869274);
        setIntField(term583603, term583603.getClass(), "gradeRank", 1997541852);
        setIntField(term583603, term583603.getClass(), "classRank", -1436484953);
        setIntField(term583603, term583603.getClass(), "courseRank", 1778454602);
        setField(term583603, term583603.getClass(), "charaSlot", term583668);
        setField(term583603, term583603.getClass(), "charaLockSlot", term583686);
        setLongField(term583603, term583603.getClass(), "contentBit", -5711921541541913937L);
        setIntField(term583603, term583603.getClass(), "playCount", -949068850);
        setField(term583603, term583603.getClass(), "eventWatchedDate", "WURjqfPByB");
        setField(term583603, term583603.getClass(), "lastGameId", "MZNLPBLuYG");
        setField(term583603, term583603.getClass(), "lastRomVersion", "uoiqZfKmlC");
        setField(term583603, term583603.getClass(), "lastDataVersion", "CYSDyBguOQ");
        setField(term583603, term583603.getClass(), "lastLoginDate", "NbELEvKQus");
        setField(term583603, term583603.getClass(), "lastPlayDate", "ZJsIpkNRaJ");
        setIntField(term583603, term583603.getClass(), "lastPlayCredit", 1592593009);
        setIntField(term583603, term583603.getClass(), "lastPlayMode", 879130418);
        setIntField(term583603, term583603.getClass(), "lastPlaceId", 2038265826);
        setField(term583603, term583603.getClass(), "lastPlaceName", "PHjRWHZRcP");
        setIntField(term583603, term583603.getClass(), "lastAllNetId", -1603202706);
        setIntField(term583603, term583603.getClass(), "lastRegionId", 380109998);
        setField(term583603, term583603.getClass(), "lastRegionName", "nlDvBvxyTR");
        setField(term583603, term583603.getClass(), "lastClientId", "XHMGabEhas");
        setField(term583603, term583603.getClass(), "lastCountryCode", "onYVpLElYx");
        setIntField(term583603, term583603.getClass(), "lastSelectEMoney", 5050453);
        setIntField(term583603, term583603.getClass(), "lastSelectTicket", -162905162);
        setIntField(term583603, term583603.getClass(), "lastSelectCourse", -1386372095);
        setIntField(term583603, term583603.getClass(), "lastCountCourse", -564576029);
        setField(term583603, term583603.getClass(), "firstGameId", "ISEAFGhZwE");
        setField(term583603, term583603.getClass(), "firstRomVersion", "KoEZYWOveS");
        setField(term583603, term583603.getClass(), "firstDataVersion", "RkIdSYjFRw");
        setField(term583603, term583603.getClass(), "firstPlayDate", "SxufcrWvCB");
        setField(term583603, term583603.getClass(), "compatibleCmVersion", "xhYWtqsMuu");
        setField(term583603, term583603.getClass(), "dailyBonusDate", "oxKceTvkZv");
        setField(term583603, term583603.getClass(), "dailyCourseBonusDate", "kVezViBInP");
        setField(term583603, term583603.getClass(), "lastPairLoginDate", "OqwtoJjICm");
        setField(term583603, term583603.getClass(), "lastTrialPlayDate", "BmZNpUqZlp");
        setIntField(term583603, term583603.getClass(), "playVsCount", -1378437819);
        setIntField(term583603, term583603.getClass(), "playSyncCount", 1742101842);
        setIntField(term583603, term583603.getClass(), "winCount", 491961489);
        setIntField(term583603, term583603.getClass(), "helpCount", 385060853);
        setIntField(term583603, term583603.getClass(), "comboCount", -879186041);
        setLongField(term583603, term583603.getClass(), "totalDeluxscore", -8053516491451441217L);
        setLongField(term583603, term583603.getClass(), "totalBasicDeluxscore", -6655955191546420476L);
        setLongField(term583603, term583603.getClass(), "totalAdvancedDeluxscore", 5448285695912173797L);
        setLongField(term583603, term583603.getClass(), "totalExpertDeluxscore", 5738388480651032523L);
        setLongField(term583603, term583603.getClass(), "totalMasterDeluxscore", -5212363440180838101L);
        setLongField(term583603, term583603.getClass(), "totalReMasterDeluxscore", -486926800380484757L);
        setIntField(term583603, term583603.getClass(), "totalSync", -1628180682);
        setIntField(term583603, term583603.getClass(), "totalBasicSync", -1109503793);
        setIntField(term583603, term583603.getClass(), "totalAdvancedSync", -880747354);
        setIntField(term583603, term583603.getClass(), "totalExpertSync", 734342381);
        setIntField(term583603, term583603.getClass(), "totalMasterSync", -1500948040);
        setIntField(term583603, term583603.getClass(), "totalReMasterSync", -326451162);
        setLongField(term583603, term583603.getClass(), "totalAchievement", 5102094141118158177L);
        setLongField(term583603, term583603.getClass(), "totalBasicAchievement", -8298048520168791992L);
        setLongField(term583603, term583603.getClass(), "totalAdvancedAchievement", -5667562069679457455L);
        setLongField(term583603, term583603.getClass(), "totalExpertAchievement", 3915182138338096200L);
        setLongField(term583603, term583603.getClass(), "totalMasterAchievement", -751340101312984356L);
        setLongField(term583603, term583603.getClass(), "totalReMasterAchievement", 7525642530803646610L);
        setLongField(term583603, term583603.getClass(), "playerOldRating", 2077003358649382243L);
        setLongField(term583603, term583603.getClass(), "playerNewRating", 8501675164807989656L);
        setIntField(term583603, term583603.getClass(), "banState", 2026341657);
        setLongField(term583603, term583603.getClass(), "dateTime", 3107560941246609256L);
        setField(term583601, term583601.getClass(), "user", term583603);
        setIntField(term583601, term583601.getClass(), "mapId", 1907291327);
        setIntField(term583601, term583601.getClass(), "distance", 2103579176);
        setBooleanField(term583601, term583601.getClass(), "isLock", true);
        setBooleanField(term583601, term583601.getClass(), "isClear", true);
        setBooleanField(term583601, term583601.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term583601, args);
    }

};


