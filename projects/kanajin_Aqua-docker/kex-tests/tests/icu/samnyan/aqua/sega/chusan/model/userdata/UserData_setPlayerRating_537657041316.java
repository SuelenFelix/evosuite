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
import java.lang.Integer;

public class UserData_setPlayerRating_537657041316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285920;
     Object term285997;

    public UserData_setPlayerRating_537657041316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285920 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285920, term285920.getClass(), "id", 0L);
        setField(term285920, term285920.getClass(), "card", null);
        setField(term285920, term285920.getClass(), "userName", null);
        setIntField(term285920, term285920.getClass(), "level", 0);
        setIntField(term285920, term285920.getClass(), "reincarnationNum", 0);
        setField(term285920, term285920.getClass(), "exp", null);
        setLongField(term285920, term285920.getClass(), "point", 0L);
        setLongField(term285920, term285920.getClass(), "totalPoint", 0L);
        setIntField(term285920, term285920.getClass(), "playCount", 0);
        setIntField(term285920, term285920.getClass(), "multiPlayCount", 0);
        setIntField(term285920, term285920.getClass(), "playerRating", 0);
        setIntField(term285920, term285920.getClass(), "highestRating", 0);
        setIntField(term285920, term285920.getClass(), "nameplateId", 0);
        setIntField(term285920, term285920.getClass(), "frameId", 0);
        setIntField(term285920, term285920.getClass(), "characterId", 0);
        setIntField(term285920, term285920.getClass(), "trophyId", 0);
        setIntField(term285920, term285920.getClass(), "playedTutorialBit", 0);
        setIntField(term285920, term285920.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285920, term285920.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285920, term285920.getClass(), "totalMapNum", 0);
        setLongField(term285920, term285920.getClass(), "totalHiScore", 0L);
        setLongField(term285920, term285920.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285920, term285920.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285920, term285920.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285920, term285920.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285920, term285920.getClass(), "totalUltimaHighScore", 0L);
        setField(term285920, term285920.getClass(), "eventWatchedDate", null);
        setIntField(term285920, term285920.getClass(), "friendCount", 0);
        setField(term285920, term285920.getClass(), "firstGameId", null);
        setField(term285920, term285920.getClass(), "firstRomVersion", null);
        setField(term285920, term285920.getClass(), "firstDataVersion", null);
        setField(term285920, term285920.getClass(), "firstPlayDate", null);
        setField(term285920, term285920.getClass(), "lastGameId", null);
        setField(term285920, term285920.getClass(), "lastRomVersion", null);
        setField(term285920, term285920.getClass(), "lastDataVersion", null);
        setField(term285920, term285920.getClass(), "lastLoginDate", null);
        setField(term285920, term285920.getClass(), "lastPlayDate", null);
        setIntField(term285920, term285920.getClass(), "lastPlaceId", 0);
        setField(term285920, term285920.getClass(), "lastPlaceName", null);
        setField(term285920, term285920.getClass(), "lastRegionId", null);
        setField(term285920, term285920.getClass(), "lastRegionName", null);
        setField(term285920, term285920.getClass(), "lastAllNetId", null);
        setField(term285920, term285920.getClass(), "lastClientId", null);
        setField(term285920, term285920.getClass(), "lastCountryCode", null);
        setField(term285920, term285920.getClass(), "userNameEx", null);
        setField(term285920, term285920.getClass(), "compatibleCmVersion", null);
        setIntField(term285920, term285920.getClass(), "medal", 0);
        setIntField(term285920, term285920.getClass(), "mapIconId", 0);
        setIntField(term285920, term285920.getClass(), "voiceId", 0);
        setIntField(term285920, term285920.getClass(), "avatarWear", 0);
        setIntField(term285920, term285920.getClass(), "avatarHead", 0);
        setIntField(term285920, term285920.getClass(), "avatarFace", 0);
        setIntField(term285920, term285920.getClass(), "avatarSkin", 0);
        setIntField(term285920, term285920.getClass(), "avatarItem", 0);
        setIntField(term285920, term285920.getClass(), "avatarFront", 0);
        setIntField(term285920, term285920.getClass(), "avatarBack", 0);
        setIntField(term285920, term285920.getClass(), "classEmblemBase", 0);
        setIntField(term285920, term285920.getClass(), "classEmblemMedal", 0);
        setIntField(term285920, term285920.getClass(), "stockedGridCount", 0);
        setIntField(term285920, term285920.getClass(), "exMapLoopCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattlePlayCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattleWinCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattleLoseCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285920, term285920.getClass(), "charaIllustId", 0);
        setIntField(term285920, term285920.getClass(), "skillId", 0);
        setIntField(term285920, term285920.getClass(), "overPowerPoint", 0);
        setIntField(term285920, term285920.getClass(), "overPowerRate", 0);
        setIntField(term285920, term285920.getClass(), "overPowerLowerRank", 0);
        setIntField(term285920, term285920.getClass(), "avatarPoint", 0);
        setIntField(term285920, term285920.getClass(), "battleRankId", 0);
        setIntField(term285920, term285920.getClass(), "battleRankPoint", 0);
        setIntField(term285920, term285920.getClass(), "eliteRankPoint", 0);
        setIntField(term285920, term285920.getClass(), "netBattle1stCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattle2ndCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattle3rdCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattle4thCount", 0);
        setIntField(term285920, term285920.getClass(), "netBattleCorrection", 0);
        setIntField(term285920, term285920.getClass(), "netBattleErrCnt", 0);
        setIntField(term285920, term285920.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285920, term285920.getClass(), "battleRewardStatus", 0);
        setIntField(term285920, term285920.getClass(), "battleRewardIndex", 0);
        setIntField(term285920, term285920.getClass(), "battleRewardCount", 0);
        setIntField(term285920, term285920.getClass(), "ext1", 0);
        setIntField(term285920, term285920.getClass(), "ext2", 0);
        setIntField(term285920, term285920.getClass(), "ext3", 0);
        setIntField(term285920, term285920.getClass(), "ext4", 0);
        setIntField(term285920, term285920.getClass(), "ext5", 0);
        setIntField(term285920, term285920.getClass(), "ext6", 0);
        setIntField(term285920, term285920.getClass(), "ext7", 0);
        setIntField(term285920, term285920.getClass(), "ext8", 0);
        setIntField(term285920, term285920.getClass(), "ext9", 0);
        setIntField(term285920, term285920.getClass(), "ext10", 0);
        setField(term285920, term285920.getClass(), "extStr1", null);
        setField(term285920, term285920.getClass(), "extStr2", null);
        setLongField(term285920, term285920.getClass(), "extLong1", 0L);
        setLongField(term285920, term285920.getClass(), "extLong2", 0L);
        setField(term285920, term285920.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285920, term285920.getClass(), "isNetBattleHost", false);
        setIntField(term285920, term285920.getClass(), "netBattleEndState", 0);
        term285997 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285997;
        callMethod(klass, "setPlayerRating", argTypes, term285920, args);
    }

};


