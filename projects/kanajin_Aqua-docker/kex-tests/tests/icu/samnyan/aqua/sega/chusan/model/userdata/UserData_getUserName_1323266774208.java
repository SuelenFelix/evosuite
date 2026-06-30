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

public class UserData_getUserName_1323266774208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277590;

    public UserData_getUserName_1323266774208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277590 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term277590, term277590.getClass(), "id", 0L);
        setField(term277590, term277590.getClass(), "card", null);
        setField(term277590, term277590.getClass(), "userName", null);
        setIntField(term277590, term277590.getClass(), "level", 0);
        setIntField(term277590, term277590.getClass(), "reincarnationNum", 0);
        setField(term277590, term277590.getClass(), "exp", null);
        setLongField(term277590, term277590.getClass(), "point", 0L);
        setLongField(term277590, term277590.getClass(), "totalPoint", 0L);
        setIntField(term277590, term277590.getClass(), "playCount", 0);
        setIntField(term277590, term277590.getClass(), "multiPlayCount", 0);
        setIntField(term277590, term277590.getClass(), "playerRating", 0);
        setIntField(term277590, term277590.getClass(), "highestRating", 0);
        setIntField(term277590, term277590.getClass(), "nameplateId", 0);
        setIntField(term277590, term277590.getClass(), "frameId", 0);
        setIntField(term277590, term277590.getClass(), "characterId", 0);
        setIntField(term277590, term277590.getClass(), "trophyId", 0);
        setIntField(term277590, term277590.getClass(), "playedTutorialBit", 0);
        setIntField(term277590, term277590.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term277590, term277590.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term277590, term277590.getClass(), "totalMapNum", 0);
        setLongField(term277590, term277590.getClass(), "totalHiScore", 0L);
        setLongField(term277590, term277590.getClass(), "totalBasicHighScore", 0L);
        setLongField(term277590, term277590.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term277590, term277590.getClass(), "totalExpertHighScore", 0L);
        setLongField(term277590, term277590.getClass(), "totalMasterHighScore", 0L);
        setLongField(term277590, term277590.getClass(), "totalUltimaHighScore", 0L);
        setField(term277590, term277590.getClass(), "eventWatchedDate", null);
        setIntField(term277590, term277590.getClass(), "friendCount", 0);
        setField(term277590, term277590.getClass(), "firstGameId", null);
        setField(term277590, term277590.getClass(), "firstRomVersion", null);
        setField(term277590, term277590.getClass(), "firstDataVersion", null);
        setField(term277590, term277590.getClass(), "firstPlayDate", null);
        setField(term277590, term277590.getClass(), "lastGameId", null);
        setField(term277590, term277590.getClass(), "lastRomVersion", null);
        setField(term277590, term277590.getClass(), "lastDataVersion", null);
        setField(term277590, term277590.getClass(), "lastLoginDate", null);
        setField(term277590, term277590.getClass(), "lastPlayDate", null);
        setIntField(term277590, term277590.getClass(), "lastPlaceId", 0);
        setField(term277590, term277590.getClass(), "lastPlaceName", null);
        setField(term277590, term277590.getClass(), "lastRegionId", null);
        setField(term277590, term277590.getClass(), "lastRegionName", null);
        setField(term277590, term277590.getClass(), "lastAllNetId", null);
        setField(term277590, term277590.getClass(), "lastClientId", null);
        setField(term277590, term277590.getClass(), "lastCountryCode", null);
        setField(term277590, term277590.getClass(), "userNameEx", null);
        setField(term277590, term277590.getClass(), "compatibleCmVersion", null);
        setIntField(term277590, term277590.getClass(), "medal", 0);
        setIntField(term277590, term277590.getClass(), "mapIconId", 0);
        setIntField(term277590, term277590.getClass(), "voiceId", 0);
        setIntField(term277590, term277590.getClass(), "avatarWear", 0);
        setIntField(term277590, term277590.getClass(), "avatarHead", 0);
        setIntField(term277590, term277590.getClass(), "avatarFace", 0);
        setIntField(term277590, term277590.getClass(), "avatarSkin", 0);
        setIntField(term277590, term277590.getClass(), "avatarItem", 0);
        setIntField(term277590, term277590.getClass(), "avatarFront", 0);
        setIntField(term277590, term277590.getClass(), "avatarBack", 0);
        setIntField(term277590, term277590.getClass(), "classEmblemBase", 0);
        setIntField(term277590, term277590.getClass(), "classEmblemMedal", 0);
        setIntField(term277590, term277590.getClass(), "stockedGridCount", 0);
        setIntField(term277590, term277590.getClass(), "exMapLoopCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattlePlayCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattleWinCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattleLoseCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term277590, term277590.getClass(), "charaIllustId", 0);
        setIntField(term277590, term277590.getClass(), "skillId", 0);
        setIntField(term277590, term277590.getClass(), "overPowerPoint", 0);
        setIntField(term277590, term277590.getClass(), "overPowerRate", 0);
        setIntField(term277590, term277590.getClass(), "overPowerLowerRank", 0);
        setIntField(term277590, term277590.getClass(), "avatarPoint", 0);
        setIntField(term277590, term277590.getClass(), "battleRankId", 0);
        setIntField(term277590, term277590.getClass(), "battleRankPoint", 0);
        setIntField(term277590, term277590.getClass(), "eliteRankPoint", 0);
        setIntField(term277590, term277590.getClass(), "netBattle1stCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattle2ndCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattle3rdCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattle4thCount", 0);
        setIntField(term277590, term277590.getClass(), "netBattleCorrection", 0);
        setIntField(term277590, term277590.getClass(), "netBattleErrCnt", 0);
        setIntField(term277590, term277590.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term277590, term277590.getClass(), "battleRewardStatus", 0);
        setIntField(term277590, term277590.getClass(), "battleRewardIndex", 0);
        setIntField(term277590, term277590.getClass(), "battleRewardCount", 0);
        setIntField(term277590, term277590.getClass(), "ext1", 0);
        setIntField(term277590, term277590.getClass(), "ext2", 0);
        setIntField(term277590, term277590.getClass(), "ext3", 0);
        setIntField(term277590, term277590.getClass(), "ext4", 0);
        setIntField(term277590, term277590.getClass(), "ext5", 0);
        setIntField(term277590, term277590.getClass(), "ext6", 0);
        setIntField(term277590, term277590.getClass(), "ext7", 0);
        setIntField(term277590, term277590.getClass(), "ext8", 0);
        setIntField(term277590, term277590.getClass(), "ext9", 0);
        setIntField(term277590, term277590.getClass(), "ext10", 0);
        setField(term277590, term277590.getClass(), "extStr1", null);
        setField(term277590, term277590.getClass(), "extStr2", null);
        setLongField(term277590, term277590.getClass(), "extLong1", 0L);
        setLongField(term277590, term277590.getClass(), "extLong2", 0L);
        setField(term277590, term277590.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term277590, term277590.getClass(), "isNetBattleHost", false);
        setIntField(term277590, term277590.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term277590, args);
    }

};


