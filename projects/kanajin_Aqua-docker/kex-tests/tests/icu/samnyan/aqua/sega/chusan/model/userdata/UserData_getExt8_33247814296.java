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

public class UserData_getExt8_33247814296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284366;

    public UserData_getExt8_33247814296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284366 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284366, term284366.getClass(), "id", 0L);
        setField(term284366, term284366.getClass(), "card", null);
        setField(term284366, term284366.getClass(), "userName", null);
        setIntField(term284366, term284366.getClass(), "level", 0);
        setIntField(term284366, term284366.getClass(), "reincarnationNum", 0);
        setField(term284366, term284366.getClass(), "exp", null);
        setLongField(term284366, term284366.getClass(), "point", 0L);
        setLongField(term284366, term284366.getClass(), "totalPoint", 0L);
        setIntField(term284366, term284366.getClass(), "playCount", 0);
        setIntField(term284366, term284366.getClass(), "multiPlayCount", 0);
        setIntField(term284366, term284366.getClass(), "playerRating", 0);
        setIntField(term284366, term284366.getClass(), "highestRating", 0);
        setIntField(term284366, term284366.getClass(), "nameplateId", 0);
        setIntField(term284366, term284366.getClass(), "frameId", 0);
        setIntField(term284366, term284366.getClass(), "characterId", 0);
        setIntField(term284366, term284366.getClass(), "trophyId", 0);
        setIntField(term284366, term284366.getClass(), "playedTutorialBit", 0);
        setIntField(term284366, term284366.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284366, term284366.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284366, term284366.getClass(), "totalMapNum", 0);
        setLongField(term284366, term284366.getClass(), "totalHiScore", 0L);
        setLongField(term284366, term284366.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284366, term284366.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284366, term284366.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284366, term284366.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284366, term284366.getClass(), "totalUltimaHighScore", 0L);
        setField(term284366, term284366.getClass(), "eventWatchedDate", null);
        setIntField(term284366, term284366.getClass(), "friendCount", 0);
        setField(term284366, term284366.getClass(), "firstGameId", null);
        setField(term284366, term284366.getClass(), "firstRomVersion", null);
        setField(term284366, term284366.getClass(), "firstDataVersion", null);
        setField(term284366, term284366.getClass(), "firstPlayDate", null);
        setField(term284366, term284366.getClass(), "lastGameId", null);
        setField(term284366, term284366.getClass(), "lastRomVersion", null);
        setField(term284366, term284366.getClass(), "lastDataVersion", null);
        setField(term284366, term284366.getClass(), "lastLoginDate", null);
        setField(term284366, term284366.getClass(), "lastPlayDate", null);
        setIntField(term284366, term284366.getClass(), "lastPlaceId", 0);
        setField(term284366, term284366.getClass(), "lastPlaceName", null);
        setField(term284366, term284366.getClass(), "lastRegionId", null);
        setField(term284366, term284366.getClass(), "lastRegionName", null);
        setField(term284366, term284366.getClass(), "lastAllNetId", null);
        setField(term284366, term284366.getClass(), "lastClientId", null);
        setField(term284366, term284366.getClass(), "lastCountryCode", null);
        setField(term284366, term284366.getClass(), "userNameEx", null);
        setField(term284366, term284366.getClass(), "compatibleCmVersion", null);
        setIntField(term284366, term284366.getClass(), "medal", 0);
        setIntField(term284366, term284366.getClass(), "mapIconId", 0);
        setIntField(term284366, term284366.getClass(), "voiceId", 0);
        setIntField(term284366, term284366.getClass(), "avatarWear", 0);
        setIntField(term284366, term284366.getClass(), "avatarHead", 0);
        setIntField(term284366, term284366.getClass(), "avatarFace", 0);
        setIntField(term284366, term284366.getClass(), "avatarSkin", 0);
        setIntField(term284366, term284366.getClass(), "avatarItem", 0);
        setIntField(term284366, term284366.getClass(), "avatarFront", 0);
        setIntField(term284366, term284366.getClass(), "avatarBack", 0);
        setIntField(term284366, term284366.getClass(), "classEmblemBase", 0);
        setIntField(term284366, term284366.getClass(), "classEmblemMedal", 0);
        setIntField(term284366, term284366.getClass(), "stockedGridCount", 0);
        setIntField(term284366, term284366.getClass(), "exMapLoopCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattlePlayCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattleWinCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattleLoseCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284366, term284366.getClass(), "charaIllustId", 0);
        setIntField(term284366, term284366.getClass(), "skillId", 0);
        setIntField(term284366, term284366.getClass(), "overPowerPoint", 0);
        setIntField(term284366, term284366.getClass(), "overPowerRate", 0);
        setIntField(term284366, term284366.getClass(), "overPowerLowerRank", 0);
        setIntField(term284366, term284366.getClass(), "avatarPoint", 0);
        setIntField(term284366, term284366.getClass(), "battleRankId", 0);
        setIntField(term284366, term284366.getClass(), "battleRankPoint", 0);
        setIntField(term284366, term284366.getClass(), "eliteRankPoint", 0);
        setIntField(term284366, term284366.getClass(), "netBattle1stCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattle2ndCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattle3rdCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattle4thCount", 0);
        setIntField(term284366, term284366.getClass(), "netBattleCorrection", 0);
        setIntField(term284366, term284366.getClass(), "netBattleErrCnt", 0);
        setIntField(term284366, term284366.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284366, term284366.getClass(), "battleRewardStatus", 0);
        setIntField(term284366, term284366.getClass(), "battleRewardIndex", 0);
        setIntField(term284366, term284366.getClass(), "battleRewardCount", 0);
        setIntField(term284366, term284366.getClass(), "ext1", 0);
        setIntField(term284366, term284366.getClass(), "ext2", 0);
        setIntField(term284366, term284366.getClass(), "ext3", 0);
        setIntField(term284366, term284366.getClass(), "ext4", 0);
        setIntField(term284366, term284366.getClass(), "ext5", 0);
        setIntField(term284366, term284366.getClass(), "ext6", 0);
        setIntField(term284366, term284366.getClass(), "ext7", 0);
        setIntField(term284366, term284366.getClass(), "ext8", 0);
        setIntField(term284366, term284366.getClass(), "ext9", 0);
        setIntField(term284366, term284366.getClass(), "ext10", 0);
        setField(term284366, term284366.getClass(), "extStr1", null);
        setField(term284366, term284366.getClass(), "extStr2", null);
        setLongField(term284366, term284366.getClass(), "extLong1", 0L);
        setLongField(term284366, term284366.getClass(), "extLong2", 0L);
        setField(term284366, term284366.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284366, term284366.getClass(), "isNetBattleHost", false);
        setIntField(term284366, term284366.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt8", argTypes, term284366, args);
    }

};


