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

public class UserData_getTotalExpertHighScore_339873647229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279207;

    public UserData_getTotalExpertHighScore_339873647229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term279207, term279207.getClass(), "id", 0L);
        setField(term279207, term279207.getClass(), "card", null);
        setField(term279207, term279207.getClass(), "userName", null);
        setIntField(term279207, term279207.getClass(), "level", 0);
        setIntField(term279207, term279207.getClass(), "reincarnationNum", 0);
        setField(term279207, term279207.getClass(), "exp", null);
        setLongField(term279207, term279207.getClass(), "point", 0L);
        setLongField(term279207, term279207.getClass(), "totalPoint", 0L);
        setIntField(term279207, term279207.getClass(), "playCount", 0);
        setIntField(term279207, term279207.getClass(), "multiPlayCount", 0);
        setIntField(term279207, term279207.getClass(), "playerRating", 0);
        setIntField(term279207, term279207.getClass(), "highestRating", 0);
        setIntField(term279207, term279207.getClass(), "nameplateId", 0);
        setIntField(term279207, term279207.getClass(), "frameId", 0);
        setIntField(term279207, term279207.getClass(), "characterId", 0);
        setIntField(term279207, term279207.getClass(), "trophyId", 0);
        setIntField(term279207, term279207.getClass(), "playedTutorialBit", 0);
        setIntField(term279207, term279207.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term279207, term279207.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term279207, term279207.getClass(), "totalMapNum", 0);
        setLongField(term279207, term279207.getClass(), "totalHiScore", 0L);
        setLongField(term279207, term279207.getClass(), "totalBasicHighScore", 0L);
        setLongField(term279207, term279207.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term279207, term279207.getClass(), "totalExpertHighScore", 0L);
        setLongField(term279207, term279207.getClass(), "totalMasterHighScore", 0L);
        setLongField(term279207, term279207.getClass(), "totalUltimaHighScore", 0L);
        setField(term279207, term279207.getClass(), "eventWatchedDate", null);
        setIntField(term279207, term279207.getClass(), "friendCount", 0);
        setField(term279207, term279207.getClass(), "firstGameId", null);
        setField(term279207, term279207.getClass(), "firstRomVersion", null);
        setField(term279207, term279207.getClass(), "firstDataVersion", null);
        setField(term279207, term279207.getClass(), "firstPlayDate", null);
        setField(term279207, term279207.getClass(), "lastGameId", null);
        setField(term279207, term279207.getClass(), "lastRomVersion", null);
        setField(term279207, term279207.getClass(), "lastDataVersion", null);
        setField(term279207, term279207.getClass(), "lastLoginDate", null);
        setField(term279207, term279207.getClass(), "lastPlayDate", null);
        setIntField(term279207, term279207.getClass(), "lastPlaceId", 0);
        setField(term279207, term279207.getClass(), "lastPlaceName", null);
        setField(term279207, term279207.getClass(), "lastRegionId", null);
        setField(term279207, term279207.getClass(), "lastRegionName", null);
        setField(term279207, term279207.getClass(), "lastAllNetId", null);
        setField(term279207, term279207.getClass(), "lastClientId", null);
        setField(term279207, term279207.getClass(), "lastCountryCode", null);
        setField(term279207, term279207.getClass(), "userNameEx", null);
        setField(term279207, term279207.getClass(), "compatibleCmVersion", null);
        setIntField(term279207, term279207.getClass(), "medal", 0);
        setIntField(term279207, term279207.getClass(), "mapIconId", 0);
        setIntField(term279207, term279207.getClass(), "voiceId", 0);
        setIntField(term279207, term279207.getClass(), "avatarWear", 0);
        setIntField(term279207, term279207.getClass(), "avatarHead", 0);
        setIntField(term279207, term279207.getClass(), "avatarFace", 0);
        setIntField(term279207, term279207.getClass(), "avatarSkin", 0);
        setIntField(term279207, term279207.getClass(), "avatarItem", 0);
        setIntField(term279207, term279207.getClass(), "avatarFront", 0);
        setIntField(term279207, term279207.getClass(), "avatarBack", 0);
        setIntField(term279207, term279207.getClass(), "classEmblemBase", 0);
        setIntField(term279207, term279207.getClass(), "classEmblemMedal", 0);
        setIntField(term279207, term279207.getClass(), "stockedGridCount", 0);
        setIntField(term279207, term279207.getClass(), "exMapLoopCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattlePlayCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattleWinCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattleLoseCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term279207, term279207.getClass(), "charaIllustId", 0);
        setIntField(term279207, term279207.getClass(), "skillId", 0);
        setIntField(term279207, term279207.getClass(), "overPowerPoint", 0);
        setIntField(term279207, term279207.getClass(), "overPowerRate", 0);
        setIntField(term279207, term279207.getClass(), "overPowerLowerRank", 0);
        setIntField(term279207, term279207.getClass(), "avatarPoint", 0);
        setIntField(term279207, term279207.getClass(), "battleRankId", 0);
        setIntField(term279207, term279207.getClass(), "battleRankPoint", 0);
        setIntField(term279207, term279207.getClass(), "eliteRankPoint", 0);
        setIntField(term279207, term279207.getClass(), "netBattle1stCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattle2ndCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattle3rdCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattle4thCount", 0);
        setIntField(term279207, term279207.getClass(), "netBattleCorrection", 0);
        setIntField(term279207, term279207.getClass(), "netBattleErrCnt", 0);
        setIntField(term279207, term279207.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term279207, term279207.getClass(), "battleRewardStatus", 0);
        setIntField(term279207, term279207.getClass(), "battleRewardIndex", 0);
        setIntField(term279207, term279207.getClass(), "battleRewardCount", 0);
        setIntField(term279207, term279207.getClass(), "ext1", 0);
        setIntField(term279207, term279207.getClass(), "ext2", 0);
        setIntField(term279207, term279207.getClass(), "ext3", 0);
        setIntField(term279207, term279207.getClass(), "ext4", 0);
        setIntField(term279207, term279207.getClass(), "ext5", 0);
        setIntField(term279207, term279207.getClass(), "ext6", 0);
        setIntField(term279207, term279207.getClass(), "ext7", 0);
        setIntField(term279207, term279207.getClass(), "ext8", 0);
        setIntField(term279207, term279207.getClass(), "ext9", 0);
        setIntField(term279207, term279207.getClass(), "ext10", 0);
        setField(term279207, term279207.getClass(), "extStr1", null);
        setField(term279207, term279207.getClass(), "extStr2", null);
        setLongField(term279207, term279207.getClass(), "extLong1", 0L);
        setLongField(term279207, term279207.getClass(), "extLong2", 0L);
        setField(term279207, term279207.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term279207, term279207.getClass(), "isNetBattleHost", false);
        setIntField(term279207, term279207.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term279207, args);
    }

};


