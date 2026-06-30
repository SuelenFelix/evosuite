package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setCard_1582450968307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285215;

    public UserData_setCard_1582450968307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285215 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285215, term285215.getClass(), "id", 0L);
        setField(term285215, term285215.getClass(), "card", null);
        setField(term285215, term285215.getClass(), "userName", null);
        setIntField(term285215, term285215.getClass(), "level", 0);
        setIntField(term285215, term285215.getClass(), "reincarnationNum", 0);
        setField(term285215, term285215.getClass(), "exp", null);
        setLongField(term285215, term285215.getClass(), "point", 0L);
        setLongField(term285215, term285215.getClass(), "totalPoint", 0L);
        setIntField(term285215, term285215.getClass(), "playCount", 0);
        setIntField(term285215, term285215.getClass(), "multiPlayCount", 0);
        setIntField(term285215, term285215.getClass(), "playerRating", 0);
        setIntField(term285215, term285215.getClass(), "highestRating", 0);
        setIntField(term285215, term285215.getClass(), "nameplateId", 0);
        setIntField(term285215, term285215.getClass(), "frameId", 0);
        setIntField(term285215, term285215.getClass(), "characterId", 0);
        setIntField(term285215, term285215.getClass(), "trophyId", 0);
        setIntField(term285215, term285215.getClass(), "playedTutorialBit", 0);
        setIntField(term285215, term285215.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285215, term285215.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285215, term285215.getClass(), "totalMapNum", 0);
        setLongField(term285215, term285215.getClass(), "totalHiScore", 0L);
        setLongField(term285215, term285215.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285215, term285215.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285215, term285215.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285215, term285215.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285215, term285215.getClass(), "totalUltimaHighScore", 0L);
        setField(term285215, term285215.getClass(), "eventWatchedDate", null);
        setIntField(term285215, term285215.getClass(), "friendCount", 0);
        setField(term285215, term285215.getClass(), "firstGameId", null);
        setField(term285215, term285215.getClass(), "firstRomVersion", null);
        setField(term285215, term285215.getClass(), "firstDataVersion", null);
        setField(term285215, term285215.getClass(), "firstPlayDate", null);
        setField(term285215, term285215.getClass(), "lastGameId", null);
        setField(term285215, term285215.getClass(), "lastRomVersion", null);
        setField(term285215, term285215.getClass(), "lastDataVersion", null);
        setField(term285215, term285215.getClass(), "lastLoginDate", null);
        setField(term285215, term285215.getClass(), "lastPlayDate", null);
        setIntField(term285215, term285215.getClass(), "lastPlaceId", 0);
        setField(term285215, term285215.getClass(), "lastPlaceName", null);
        setField(term285215, term285215.getClass(), "lastRegionId", null);
        setField(term285215, term285215.getClass(), "lastRegionName", null);
        setField(term285215, term285215.getClass(), "lastAllNetId", null);
        setField(term285215, term285215.getClass(), "lastClientId", null);
        setField(term285215, term285215.getClass(), "lastCountryCode", null);
        setField(term285215, term285215.getClass(), "userNameEx", null);
        setField(term285215, term285215.getClass(), "compatibleCmVersion", null);
        setIntField(term285215, term285215.getClass(), "medal", 0);
        setIntField(term285215, term285215.getClass(), "mapIconId", 0);
        setIntField(term285215, term285215.getClass(), "voiceId", 0);
        setIntField(term285215, term285215.getClass(), "avatarWear", 0);
        setIntField(term285215, term285215.getClass(), "avatarHead", 0);
        setIntField(term285215, term285215.getClass(), "avatarFace", 0);
        setIntField(term285215, term285215.getClass(), "avatarSkin", 0);
        setIntField(term285215, term285215.getClass(), "avatarItem", 0);
        setIntField(term285215, term285215.getClass(), "avatarFront", 0);
        setIntField(term285215, term285215.getClass(), "avatarBack", 0);
        setIntField(term285215, term285215.getClass(), "classEmblemBase", 0);
        setIntField(term285215, term285215.getClass(), "classEmblemMedal", 0);
        setIntField(term285215, term285215.getClass(), "stockedGridCount", 0);
        setIntField(term285215, term285215.getClass(), "exMapLoopCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattlePlayCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattleWinCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattleLoseCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285215, term285215.getClass(), "charaIllustId", 0);
        setIntField(term285215, term285215.getClass(), "skillId", 0);
        setIntField(term285215, term285215.getClass(), "overPowerPoint", 0);
        setIntField(term285215, term285215.getClass(), "overPowerRate", 0);
        setIntField(term285215, term285215.getClass(), "overPowerLowerRank", 0);
        setIntField(term285215, term285215.getClass(), "avatarPoint", 0);
        setIntField(term285215, term285215.getClass(), "battleRankId", 0);
        setIntField(term285215, term285215.getClass(), "battleRankPoint", 0);
        setIntField(term285215, term285215.getClass(), "eliteRankPoint", 0);
        setIntField(term285215, term285215.getClass(), "netBattle1stCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattle2ndCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattle3rdCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattle4thCount", 0);
        setIntField(term285215, term285215.getClass(), "netBattleCorrection", 0);
        setIntField(term285215, term285215.getClass(), "netBattleErrCnt", 0);
        setIntField(term285215, term285215.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285215, term285215.getClass(), "battleRewardStatus", 0);
        setIntField(term285215, term285215.getClass(), "battleRewardIndex", 0);
        setIntField(term285215, term285215.getClass(), "battleRewardCount", 0);
        setIntField(term285215, term285215.getClass(), "ext1", 0);
        setIntField(term285215, term285215.getClass(), "ext2", 0);
        setIntField(term285215, term285215.getClass(), "ext3", 0);
        setIntField(term285215, term285215.getClass(), "ext4", 0);
        setIntField(term285215, term285215.getClass(), "ext5", 0);
        setIntField(term285215, term285215.getClass(), "ext6", 0);
        setIntField(term285215, term285215.getClass(), "ext7", 0);
        setIntField(term285215, term285215.getClass(), "ext8", 0);
        setIntField(term285215, term285215.getClass(), "ext9", 0);
        setIntField(term285215, term285215.getClass(), "ext10", 0);
        setField(term285215, term285215.getClass(), "extStr1", null);
        setField(term285215, term285215.getClass(), "extStr2", null);
        setLongField(term285215, term285215.getClass(), "extLong1", 0L);
        setLongField(term285215, term285215.getClass(), "extLong2", 0L);
        setField(term285215, term285215.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285215, term285215.getClass(), "isNetBattleHost", false);
        setIntField(term285215, term285215.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCard", argTypes, term285215, args);
    }

};


