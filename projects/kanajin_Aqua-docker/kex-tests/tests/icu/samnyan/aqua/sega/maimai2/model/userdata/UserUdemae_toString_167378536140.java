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

public class UserUdemae_toString_167378536140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118410;

    public UserUdemae_toString_167378536140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118416 = new Long(-433040798405298080L);
        Integer term118479 = new Integer(1246505552);
        Integer term118481 = new Integer(-1456497810);
        Integer term118483 = new Integer(61954667);
        Integer term118485 = new Integer(-919022885);
        Integer term118487 = new Integer(-1836286878);
        Integer term118489 = new Integer(276336694);
        Integer term118491 = new Integer(1627938506);
        Integer term118493 = new Integer(386284750);
        Integer term118495 = new Integer(906856023);
        ArrayList term118477 = new ArrayList();
        ((ArrayList) term118477).add(term118479);
        ((ArrayList) term118477).add(term118481);
        ((ArrayList) term118477).add(term118483);
        ((ArrayList) term118477).add(term118485);
        ((ArrayList) term118477).add(term118487);
        ((ArrayList) term118477).add(term118489);
        ((ArrayList) term118477).add(term118491);
        ((ArrayList) term118477).add(term118493);
        ((ArrayList) term118477).add(term118495);
        Integer term118501 = new Integer(198857801);
        Integer term118503 = new Integer(1342884142);
        Integer term118505 = new Integer(-1454325068);
        Integer term118507 = new Integer(346714653);
        ArrayList term118499 = new ArrayList();
        ((ArrayList) term118499).add(term118501);
        ((ArrayList) term118499).add(term118503);
        ((ArrayList) term118499).add(term118505);
        ((ArrayList) term118499).add(term118507);
        term118410 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term118412 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term118414 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118445 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118410, term118410.getClass(), "id", -189747828072599611L);
        setLongField(term118412, term118412.getClass(), "id", -1842662994637603666L);
        setLongField(term118414, term118414.getClass(), "id", -5123487854241278445L);
        setField(term118414, term118414.getClass(), "extId", term118416);
        setField(term118414, term118414.getClass(), "luid", "SKvGKyhOVM");
        setIntField(term118431, term118431.getClass(), "year", 2020);
        setShortField(term118431, term118431.getClass(), "month", (short) 10);
        setShortField(term118431, term118431.getClass(), "day", (short) 10);
        setField(term118430, term118430.getClass(), "date", term118431);
        setByteField(term118435, term118435.getClass(), "hour", (byte) 8);
        setByteField(term118435, term118435.getClass(), "minute", (byte) 35);
        setByteField(term118435, term118435.getClass(), "second", (byte) 54);
        setIntField(term118435, term118435.getClass(), "nano", 115111505);
        setField(term118430, term118430.getClass(), "time", term118435);
        setField(term118414, term118414.getClass(), "registerTime", term118430);
        setIntField(term118441, term118441.getClass(), "year", 2017);
        setShortField(term118441, term118441.getClass(), "month", (short) 10);
        setShortField(term118441, term118441.getClass(), "day", (short) 24);
        setField(term118440, term118440.getClass(), "date", term118441);
        setByteField(term118445, term118445.getClass(), "hour", (byte) 21);
        setByteField(term118445, term118445.getClass(), "minute", (byte) 10);
        setByteField(term118445, term118445.getClass(), "second", (byte) 20);
        setIntField(term118445, term118445.getClass(), "nano", 736076804);
        setField(term118440, term118440.getClass(), "time", term118445);
        setField(term118414, term118414.getClass(), "accessTime", term118440);
        setField(term118412, term118412.getClass(), "card", term118414);
        setField(term118412, term118412.getClass(), "userName", "rfjheENdEG");
        setIntField(term118412, term118412.getClass(), "isNetMember", 1199908250);
        setIntField(term118412, term118412.getClass(), "iconId", 1616884797);
        setIntField(term118412, term118412.getClass(), "plateId", 2030586700);
        setIntField(term118412, term118412.getClass(), "titleId", -340603553);
        setIntField(term118412, term118412.getClass(), "partnerId", 225498620);
        setIntField(term118412, term118412.getClass(), "frameId", -1390906119);
        setIntField(term118412, term118412.getClass(), "selectMapId", 36971401);
        setIntField(term118412, term118412.getClass(), "totalAwake", 1516544818);
        setIntField(term118412, term118412.getClass(), "gradeRating", 194365806);
        setIntField(term118412, term118412.getClass(), "musicRating", 953836264);
        setIntField(term118412, term118412.getClass(), "playerRating", 1420814192);
        setIntField(term118412, term118412.getClass(), "highestRating", -382860485);
        setIntField(term118412, term118412.getClass(), "gradeRank", 634627334);
        setIntField(term118412, term118412.getClass(), "classRank", 1164370758);
        setIntField(term118412, term118412.getClass(), "courseRank", 857653739);
        setField(term118412, term118412.getClass(), "charaSlot", term118477);
        setField(term118412, term118412.getClass(), "charaLockSlot", term118499);
        setLongField(term118412, term118412.getClass(), "contentBit", -2607843712049587713L);
        setIntField(term118412, term118412.getClass(), "playCount", -1000522677);
        setField(term118412, term118412.getClass(), "eventWatchedDate", "DqnOOFfIgX");
        setField(term118412, term118412.getClass(), "lastGameId", "ENRTZxfyCj");
        setField(term118412, term118412.getClass(), "lastRomVersion", "CRCgbTFQSa");
        setField(term118412, term118412.getClass(), "lastDataVersion", "HpODnMoCGi");
        setField(term118412, term118412.getClass(), "lastLoginDate", "QoZOWwrkVW");
        setField(term118412, term118412.getClass(), "lastPlayDate", "eGOXSsYDTH");
        setIntField(term118412, term118412.getClass(), "lastPlayCredit", -17458048);
        setIntField(term118412, term118412.getClass(), "lastPlayMode", 1912855522);
        setIntField(term118412, term118412.getClass(), "lastPlaceId", 1949021422);
        setField(term118412, term118412.getClass(), "lastPlaceName", "LIheLKvBPl");
        setIntField(term118412, term118412.getClass(), "lastAllNetId", -912838937);
        setIntField(term118412, term118412.getClass(), "lastRegionId", 16552477);
        setField(term118412, term118412.getClass(), "lastRegionName", "skbwTMoBkR");
        setField(term118412, term118412.getClass(), "lastClientId", "nyZemBzxeX");
        setField(term118412, term118412.getClass(), "lastCountryCode", "mYUsMDfwJF");
        setIntField(term118412, term118412.getClass(), "lastSelectEMoney", -102621386);
        setIntField(term118412, term118412.getClass(), "lastSelectTicket", -1817209345);
        setIntField(term118412, term118412.getClass(), "lastSelectCourse", -1215141504);
        setIntField(term118412, term118412.getClass(), "lastCountCourse", -485437241);
        setField(term118412, term118412.getClass(), "firstGameId", "IYNumeLuJm");
        setField(term118412, term118412.getClass(), "firstRomVersion", "baWqGUwddd");
        setField(term118412, term118412.getClass(), "firstDataVersion", "ytUYpWefdA");
        setField(term118412, term118412.getClass(), "firstPlayDate", "fdBtFIcFIQ");
        setField(term118412, term118412.getClass(), "compatibleCmVersion", "XixxNbivtN");
        setField(term118412, term118412.getClass(), "dailyBonusDate", "wOXNBqWiix");
        setField(term118412, term118412.getClass(), "dailyCourseBonusDate", "inGpCNlqqu");
        setField(term118412, term118412.getClass(), "lastPairLoginDate", "PzAzTtIUoU");
        setField(term118412, term118412.getClass(), "lastTrialPlayDate", "pltGCOzvHY");
        setIntField(term118412, term118412.getClass(), "playVsCount", -1166670409);
        setIntField(term118412, term118412.getClass(), "playSyncCount", 832294648);
        setIntField(term118412, term118412.getClass(), "winCount", -840215577);
        setIntField(term118412, term118412.getClass(), "helpCount", -53296007);
        setIntField(term118412, term118412.getClass(), "comboCount", -424687506);
        setLongField(term118412, term118412.getClass(), "totalDeluxscore", 8783385027474010513L);
        setLongField(term118412, term118412.getClass(), "totalBasicDeluxscore", 8798081825245510432L);
        setLongField(term118412, term118412.getClass(), "totalAdvancedDeluxscore", -7961081262439193657L);
        setLongField(term118412, term118412.getClass(), "totalExpertDeluxscore", 179552899106698143L);
        setLongField(term118412, term118412.getClass(), "totalMasterDeluxscore", 2000871719067281404L);
        setLongField(term118412, term118412.getClass(), "totalReMasterDeluxscore", 2513828001019390305L);
        setIntField(term118412, term118412.getClass(), "totalSync", -624302325);
        setIntField(term118412, term118412.getClass(), "totalBasicSync", -1974788609);
        setIntField(term118412, term118412.getClass(), "totalAdvancedSync", -262908707);
        setIntField(term118412, term118412.getClass(), "totalExpertSync", 885420232);
        setIntField(term118412, term118412.getClass(), "totalMasterSync", -884205561);
        setIntField(term118412, term118412.getClass(), "totalReMasterSync", 1568826803);
        setLongField(term118412, term118412.getClass(), "totalAchievement", 1343365543075006207L);
        setLongField(term118412, term118412.getClass(), "totalBasicAchievement", -6723803215469447157L);
        setLongField(term118412, term118412.getClass(), "totalAdvancedAchievement", -3908796315764473052L);
        setLongField(term118412, term118412.getClass(), "totalExpertAchievement", -2767466084205664605L);
        setLongField(term118412, term118412.getClass(), "totalMasterAchievement", 2329525670158942349L);
        setLongField(term118412, term118412.getClass(), "totalReMasterAchievement", -2680678097190186121L);
        setLongField(term118412, term118412.getClass(), "playerOldRating", -4299409543631835734L);
        setLongField(term118412, term118412.getClass(), "playerNewRating", 6496498735697852989L);
        setIntField(term118412, term118412.getClass(), "banState", 1283114550);
        setLongField(term118412, term118412.getClass(), "dateTime", 7607548906254675970L);
        setField(term118410, term118410.getClass(), "user", term118412);
        setIntField(term118410, term118410.getClass(), "rate", -64917079);
        setIntField(term118410, term118410.getClass(), "maxRate", 14382041);
        setIntField(term118410, term118410.getClass(), "classValue", -2016163798);
        setIntField(term118410, term118410.getClass(), "maxClassValue", 1260602495);
        setIntField(term118410, term118410.getClass(), "totalWinNum", 2098871750);
        setIntField(term118410, term118410.getClass(), "totalLoseNum", 583294548);
        setIntField(term118410, term118410.getClass(), "maxWinNum", -2034642375);
        setIntField(term118410, term118410.getClass(), "maxLoseNum", -1486717740);
        setIntField(term118410, term118410.getClass(), "winNum", 1578135347);
        setIntField(term118410, term118410.getClass(), "loseNum", -1283825868);
        setIntField(term118410, term118410.getClass(), "npcTotalWinNum", 322372633);
        setIntField(term118410, term118410.getClass(), "npcTotalLoseNum", 1255794961);
        setIntField(term118410, term118410.getClass(), "npcMaxWinNum", 232805435);
        setIntField(term118410, term118410.getClass(), "npcMaxLoseNum", 721981536);
        setIntField(term118410, term118410.getClass(), "npcWinNum", 91610201);
        setIntField(term118410, term118410.getClass(), "npcLoseNum", -1281117768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term118410, args);
    }

};


